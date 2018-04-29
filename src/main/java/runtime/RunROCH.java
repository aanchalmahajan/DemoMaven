package runtime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunROCH {
	public static int LineNum = 0;
    public static ArrayList<String> recordCollection = new ArrayList<String>();
    public static Stack<SymbolMap> symbolTable = new Stack<SymbolMap>();

    public static void run(String fileName) {
        readFile(fileName);
        try {
            for (LineNum = 0; LineNum < recordCollection.size(); LineNum++) {
                List<String> tokens = getTokens(recordCollection.get(LineNum));
                if (recordCollection.get(LineNum).compareToIgnoreCase("EOF") == 0) {
                    ParseROCH.ProcessTokens(tokens);
                    break;
                }
                ParseROCH.ProcessTokens(tokens);
            }
        } catch (Exception e) {

            StringWriter writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            e.printStackTrace(printWriter);
            printWriter.flush();

            System.out.println("Error Processing the File : \n\n" + writer.toString());
        }
    }

    private static void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
            	recordCollection.add(line);
            reader.close();
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
    }

    public static List<String> getTokens(String str) {
        List<String> tokens = new ArrayList<String>();
        String regex = "\"([^\"]*)\"|(\\S+)";
        Matcher m = Pattern.compile(regex).matcher(str);
        while (m.find()) {
            if (m.group(1) != null)
                tokens.add(m.group(1));
            else
                tokens.add(m.group(2));
        }
        return tokens;
    }

}
