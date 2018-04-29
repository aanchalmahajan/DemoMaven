package compiler;

public class OperatorRetriever {

    public static String retrieveOperator(String operator) {
        String intermediateOperator = "";
        switch (operator) {
            case "+":
                intermediateOperator = "ADD";
                break;
            case "-":
                intermediateOperator = "SUB";
                break;
            case "*":
                intermediateOperator = "MUL";
                break;
            case "/":
                intermediateOperator = "DIV";
                break;
            case "<":
                intermediateOperator = "LT";
                break;
            case ">":
                intermediateOperator = "GT";
                break;
            case "<=":
                intermediateOperator = "LE";
                break;
            case ">=":
                intermediateOperator = "GE";
                break;
            default:
                System.out.println("ERROR: '" + operator + "' operator is not supported by our grammar.");
                System.exit(0);
                break;
        }
        return intermediateOperator;
    }
}