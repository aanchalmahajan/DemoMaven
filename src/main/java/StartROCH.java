import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import compiler.IntermediateCodeGenerator;
import compiler.RochGrammarLexer;
import compiler.RochGrammarParser;
import runtime.RunROCH;

public class StartROCH {

	public static void main(String[] args) throws IOException {

        try {

            String filename = args[0];

            if (!filename.substring(filename.lastIndexOf(".") + 1).equals("rc")) {

                System.out.println("ERROR: Invalid file name. Please use a 'rc' extension file.");

                System.exit(0);

            }

            RochGrammarLexer lexer = new RochGrammarLexer(new ANTLRFileStream(filename));

            RochGrammarParser parser = new RochGrammarParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.grammarstart();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new IntermediateCodeGenerator(), tree);



            filename = filename.substring(0, filename.indexOf('.')) + ".rcic";

            createFile(filename);

            RunROCH.run(filename);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    public static void createFile(String filename) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File(filename));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

        for (String str : IntermediateCodeGenerator.intermediateFile) {

            writer.write(str);

            writer.newLine();

        }

        writer.close();

    }
}