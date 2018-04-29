package runtime;

import java.util.Arrays;
import java.util.List;

public class ExecuteROCH {
	public static void insert(String variableName, String variableValue) {
        SymbolMap map = new SymbolMap(variableName, variableValue);
        RunROCH.symbolTable.push(map);
    }

    public static String getValue(String variableName) {
        for (int i = RunROCH.symbolTable.size() - 1; i >= 0; i--)
            if (variableName.equalsIgnoreCase(RunROCH.symbolTable.get(i).getKey()))
                return RunROCH.symbolTable.get(i).getValue();
        return variableName;
    }

    public static void updateValue(List<String> tokenList) {
        String updatedValue = getValue(tokenList.get(1));

        for (int i = RunROCH.symbolTable.size() - 1; i >= 0; i--) {
            if (RunROCH.symbolTable.get(i).getKey().compareToIgnoreCase(tokenList.get(0)) == 0) {
                RunROCH.symbolTable.get(i).setValue(updatedValue);
                break;
            }
        }
    }
    public static void declareNumber(List<String> tokenList) {
        String key = tokenList.get(1);

        if (tokenList.size() == 2) {
            insert(key, "0");
        }
    }

    public static void declareBool(List<String> tokenList) {
        String key = tokenList.get(1);

        if (tokenList.size() == 2) {
            insert(key, "false");
        }
    }

    public static void declareFloat(List<String> tokenList) {
        String key = tokenList.get(1);

        if (tokenList.size() == 2) {
            insert(key, "0.0");
        }
    }

    public static void outStatement(List<String> tokenList) {
        System.out.println(getValue(tokenList.get(1)));
    }

    public static void popSymbolTable(String stringValue) {
        for (int i = RunROCH.symbolTable.size() - 1; i >= 0; i--)
            if (RunROCH.symbolTable.get(i).getKey().compareToIgnoreCase(stringValue) == 0) {
                RunROCH.symbolTable.pop();
                return;
            } else
                RunROCH.symbolTable.pop();
    }

    public static void algebraicOperators(List<String> tokenList) {

        try {
            //System.out.println(tokens.toString());
            int operand1 = Integer.parseInt(getValue(tokenList.get(tokenList.size() - 2)));
            int operand2 = Integer.parseInt(getValue(tokenList.get(tokenList.size() - 1)));

            //System.out.println("Operands:" + operand1 + " " + operand2);
            switch (tokenList.get(0)) {
                case "ADD":
                    updateValue(Arrays.asList(tokenList.get(1), Integer.toString(operand1 + operand2)));
                    break;
                case "SUB":
                    updateValue(Arrays.asList(tokenList.get(1), Integer.toString(operand1 - operand2)));
                    break;
                case "MUL":
                    updateValue(Arrays.asList(tokenList.get(1), Integer.toString(operand1 * operand2)));
                    break;
                case "DIV":
                    updateValue(Arrays.asList(tokenList.get(1), Integer.toString(operand1 / operand2)));
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e);
        }
    }

    public static void relationalOperation(List<String> tokenList) {
        try {
            int operand1 = Integer.parseInt(getValue(tokenList.get(tokenList.size() - 2)));
            int operand2 = Integer.parseInt(getValue(tokenList.get(tokenList.size() - 1)));

            //System.out.println("Operands:" + operand1 + " " + operand2);

            switch (tokenList.get(0)) {
                case "GT":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 > operand2)));
                    break;
                case "GE":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 >= operand2)));
                    break;
                case "LT":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 < operand2)));
                    break;
                case "LE":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 <= operand2)));
                    break;
                case "ET":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 == operand2)));
                    break;
                case "NE":
                    updateValue(Arrays.asList(tokenList.get(1), Boolean.toString(operand1 != operand2)));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }


    public static void logicalOperation(List<String> tokenList) {
        try {
            switch (tokenList.get(0)) {
                case "AND":
                    Arrays.asList(tokenList.get(1), Boolean.toString(Boolean.valueOf(getValue(tokenList.get(1))) && Boolean.valueOf(getValue(tokenList.get(2)))));
                    break;
                case "OR":
                    Arrays.asList(tokenList.get(1), Boolean.toString(Boolean.valueOf(getValue(tokenList.get(1))) || Boolean.valueOf(getValue(tokenList.get(2)))));
                    break;
                case "NOT":
                    Arrays.asList(tokenList.get(1), Boolean.toString(!Boolean.valueOf(getValue(tokenList.get(1)))));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }


    public static void WhileCondition(List<String> tokenList) {
        int i = RunROCH.LineNum;
        insert("UNTIL", i + "");
        if (getValue(tokenList.get(1)).compareToIgnoreCase("true") == 0) {
        } else {
            for (int j = RunROCH.LineNum + 1; j < RunROCH.recordCollection.size(); j++) {
                List<String> temptokens = RunROCH.getTokens(RunROCH.recordCollection.get(j));
                if (temptokens.get(0).equalsIgnoreCase("UNTILEND")) {
                    RunROCH.LineNum = j;
                    return;
                }
            }
        }
    }

    public static void WhileEndCondition(List<String> tokenList) {
        RunROCH.LineNum = Integer.parseInt(getValue("UNTIL")) - 1;
    }

    public static void IfCondition(List<String> tokenList) {
        if (getValue(tokenList.get(1)).compareToIgnoreCase("true") == 0)
            insert("CHECK", "NULL");
        else
            for (int i = RunROCH.LineNum + 1; i < RunROCH.recordCollection.size(); i++) {
                List<String> temptokens = RunROCH.getTokens(RunROCH.recordCollection.get(i));
                if (temptokens.get(0).equalsIgnoreCase("CHECKEND")) {
                    RunROCH.LineNum = i;
                    return;
                }
            }
    }

    public static void ElseCondition(List<String> tokenList) {
        if (tokenList.size() == 1)
            insert("OTHERWISE", "NULL");
        else {
            if (getValue(tokenList.get(1)).compareToIgnoreCase("true") == 0)
                insert("CHECK", "NULL");
            else
                for (int i = RunROCH.LineNum + 1; i < RunROCH.recordCollection.size(); i++) {
                    List<String> temptokens = RunROCH.getTokens(RunROCH.recordCollection.get(i));
                    if (temptokens.get(0).equalsIgnoreCase("CHECKEND")) {
                        RunROCH.LineNum = i;
                        return;
                    }
                }
        }

    }

    public static void EndIfCondition() {
        for (int i = RunROCH.LineNum + 1; i < RunROCH.recordCollection.size(); i++) {
            List<String> temptokens = RunROCH.getTokens(RunROCH.recordCollection.get(i));
            if (temptokens.get(0).equalsIgnoreCase("OTHERWISEEND")) {
                RunROCH.LineNum = i;
                return;
            }
        }
    }

}
