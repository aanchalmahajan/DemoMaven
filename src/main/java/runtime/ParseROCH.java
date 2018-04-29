package runtime;

import java.util.Arrays;
import java.util.List;

public class ParseROCH {

	public static void ProcessTokens(List<String> tokenList) {

		switch (tokenList.get(0)) {

		case "NUM" :		ExecuteROCH.declareNumber(tokenList);
			break;
		case "BOOL" : 		ExecuteROCH.declareBool(tokenList);
			break;
		case "PRINT" : 		ExecuteROCH.outStatement(tokenList);
			break;
		case "PUSH" : 		ExecuteROCH.updateValue(Arrays.asList(tokenList.get(1), tokenList.get(2)));
			break;
		case "TERMINATE" : 		ExecuteROCH.popSymbolTable("EOF");
			break;
		case "ADD" : 		ExecuteROCH.algebraicOperators(tokenList);
			break;
		case "SUB" : 		ExecuteROCH.algebraicOperators(tokenList);
			break;
		case "MUL" : 		ExecuteROCH.algebraicOperators(tokenList);
			break;
		case "DIV" : 		ExecuteROCH.algebraicOperators(tokenList);
			break;
		case "GT" : 		ExecuteROCH.relationalOperation(tokenList);
			break;
		case "GE" : 		ExecuteROCH.relationalOperation(tokenList);
			break;
		case "LT" : 		ExecuteROCH.relationalOperation(tokenList);
			break;
		case "LE" : 		ExecuteROCH.relationalOperation(tokenList);
			break;
		case "UNTIL" : 		ExecuteROCH.WhileCondition(tokenList);
		 	break;						
		case "UNTILEND" : 	ExecuteROCH.WhileEndCondition(tokenList);
							ExecuteROCH.popSymbolTable("UNTIL");
		 	break;						
		case "CHECK" : 		ExecuteROCH.IfCondition(tokenList);
			break;
		case "OTHERWISE" : 		ExecuteROCH.ElseCondition(tokenList);
			break;
		case "CHECKEND" : 		ExecuteROCH.EndIfCondition();
					 		ExecuteROCH.popSymbolTable("CHECK");
			break;
		case "OTHERWISEEND":
					 		ExecuteROCH.popSymbolTable("OTHERWISE");
			break;
		default : break;
		}
	}
}