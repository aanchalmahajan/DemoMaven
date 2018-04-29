package compiler;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IntermediateCodeGenerator extends RochGrammarBaseListener {
   
    private LinkedHashMap<String, String> symbolTable = new LinkedHashMap<String, String>();
    public static List<String> intermediateFile = new ArrayList<String>();
    int accumulator=0;

    /* Overriding the default implementation of exitProgram in GrammarBaseListener */
    @Override
    public void exitGrammarstart(RochGrammarParser.GrammarstartContext context) {
        intermediateFile.add("TERMINATE");
    }

    /* Overriding the default implementation of exitDeclaration in GrammarBaseListener */
    @Override
    public void exitAssignment(RochGrammarParser.AssignmentContext context) {
        int lineCount = context.getChildCount();
        if (lineCount == 3) {
            if (context.getChild(1).getText().equals("=")) {
                if (symbolTable.containsKey(context.getChild(2).getText())) {
                    intermediateFile.add("PUSH " + context.getChild(0).getText() + " "
                            + symbolTable.get(context.getChild(2).getText()));
                } else {
                    intermediateFile.add("PUSH " + context.getChild(0).getText() + " " + context.getChild(2).getText());
                }
            }
        } else {
            System.out.println("ERROR: This assignment is not supported by our grammar.");
        }
    }

    @Override
    public void enterCheck(RochGrammarParser.CheckContext context) {
        StringBuilder checkStatement = new StringBuilder();
        String operator = context.getChild(1).getChild(1).getText();
        intermediateFile.add("BOOL value");
        checkStatement.append(OperatorRetriever.retrieveOperator(operator));
        checkStatement.append(" value ");
        String leftVar = context.getChild(1).getChild(0).getText();
        checkStatement.append(leftVar).append(" ");
        String rightVar = context.getChild(1).getChild(2).getText();
        checkStatement.append(rightVar);
        intermediateFile.add(checkStatement.toString());
        checkStatement.setLength(0);
        checkStatement.append(context.getChild(0).getText().toUpperCase()).append(" ").append("value");
        intermediateFile.add(checkStatement.toString());
    }

    /* Overriding the default implementation of exitCheckCondition in GrammarBaseListener */
    @Override
    public void exitCheck(RochGrammarParser.CheckContext context) {
        intermediateFile.add("CHECKEND");
    }

    /* Overriding the default implementation of enterOtherwise in GrammarBaseListener */
    @Override
    public void enterOtherwise(RochGrammarParser.OtherwiseContext context) {
        intermediateFile.add("OTHERWISE");
    }

    /* Overriding the default implementation of exitOtherwise in GrammarBaseListener */
    @Override
    public void exitOtherwise(RochGrammarParser.OtherwiseContext context) {
        intermediateFile.add("OTHERWISEEND");
    }

    /*Overriding the default implementation of enterUntil*/
    @Override
    public void enterUntil(RochGrammarParser.UntilContext context) {
        StringBuilder untilLoop = new StringBuilder();
        String operator = context.getChild(1).getChild(1).getText();
        untilLoop.append(OperatorRetriever.retrieveOperator(operator));
        intermediateFile.add("BOOL value");
        untilLoop.append(" value ");
        String leftVar = context.getChild(1).getChild(0).getText();
        untilLoop.append(leftVar).append(" ");
        String rightVar = context.getChild(1).getChild(2).getText();
        untilLoop.append(rightVar);
        intermediateFile.add(untilLoop.toString());
        untilLoop.setLength(0);
        untilLoop.append(context.getChild(0).getText().toUpperCase()).append(" ").append("value");
        intermediateFile.add(untilLoop.toString());
    }

    /*Overriding the default implementation of exitUntilLoop*/
    @Override
    public void exitUntilLoop(RochGrammarParser.UntilLoopContext context) {
        StringBuilder untilLoop = new StringBuilder();
        String operator = context.getChild(0).getChild(1).getChild(1).getText();
        untilLoop.append(OperatorRetriever.retrieveOperator(operator));
        untilLoop.append(" value ");
        String leftVar = context.getChild(0).getChild(1).getChild(0).getChild(0).getText();
        untilLoop.append(leftVar).append(" ");
        String rightVar = context.getChild(0).getChild(1).getChild(2).getChild(0).getText();
        untilLoop.append(rightVar);
        intermediateFile.add(untilLoop.toString());
        intermediateFile.add("UNTILEND");
    }

    /* Overriding the default implementation of enterVariableDeclaration  */
    @Override
    public void enterVariableDeclaration(RochGrammarParser.VariableDeclarationContext ctx) {
        String booleanType = "bool";
        String numberType = "num";
        if (ctx.getChildCount() == 2) {
            if (ctx.getChild(0).getText().compareToIgnoreCase(booleanType) == 0) {
                intermediateFile.add("BOOL " + ctx.getChild(1).getText());
            } else if (ctx.getChild(0).getText().compareToIgnoreCase(numberType) == 0) {
                intermediateFile.add("NUM " + ctx.getChild(1).getText());
            } else {
                System.out.println("ERROR: Variable Declaration is invalid");
            }
        }
    }

    /*Overriding the default implementation of exitDisplay  */
    @Override
    public void exitDisplay(RochGrammarParser.DisplayContext ctx) {
        String displayString = "display(";
        if (ctx.getChildCount() == 3) {
            if (ctx.getChild(0).getText().equals(displayString) && ctx.getChild(2).getText().equals(")")) {
                if (symbolTable.containsKey(ctx.getChild(1).getText())) {
                    intermediateFile.add("PRINT" + " " + symbolTable.get(ctx.getChild(1).getText()));
                } else {
                    intermediateFile.add("PRINT" + " " + ctx.getChild(1).getText());
                }
            } else {
                System.out.println("ERROR: Syntax Error");
            }
        } else {
            System.out.println("ERROR: Syntax Error");
        }
    }

        /* Overriding the default implementation of */
        @Override
        public void exitArithmeticExp(RochGrammarParser.ArithmeticExpContext ctx) {
            if (ctx.getChildCount() == 3) {

                StringBuilder string = new StringBuilder();
                string.append(OperatorRetriever.retrieveOperator(ctx.getChild(1).getText())).append(" ");

                if (symbolTable.containsKey(ctx.getChild(0).getText()) && symbolTable
                        .containsKey(ctx.getChild(2).getText())) {
                    string.append("load" + accumulator + " ").append(symbolTable.get(ctx.getChild(0).getText()))
                            .append(" ").append(symbolTable.get(ctx.getChild(2).getText()));
                } else if (symbolTable.containsKey(ctx.getChild(2).getText())) {
                    string.append(symbolTable.get(ctx.getChild(2).getText())).append(" ");
                    string.append(ctx.getChild(0).getText()).append(" ");
                    string.append(symbolTable.get(ctx.getChild(2).getText()));
                } else if (symbolTable.containsKey(ctx.getChild(0).getText())) {
                    string.append(symbolTable.get(ctx.getChild(0).getText())).append(" ");
                    string.append(ctx.getChild(2).getText()).append(" ");
                    string.append(symbolTable.get(ctx.getChild(0).getText()));
                } else {
                    intermediateFile.add("NUM load" + ++accumulator);
                    string.append("load" + accumulator).append(" ").append(ctx.getChild(0).getText());
                    string.append(" ").append(ctx.getChild(2).getText());
                }
                intermediateFile.add(string.toString());
                string.setLength(0);
                string.append(ctx.getChild(0).getText()).append(ctx.getChild(1).getText());
                string.append(ctx.getChild(2).getText());
                symbolTable.put(string.toString(), "load" + accumulator);
            }
        }
}
