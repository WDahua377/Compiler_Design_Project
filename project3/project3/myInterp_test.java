import org.antlr.runtime.*;
 
public class myInterp_test {
    public static void main(String[] args) throws Exception {
        CharStream input = new ANTLRFileStream(args[0]);
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        myInterpLexer lexer = new myInterpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        myInterpParser parser = new myInterpParser(tokens);
        parser.include();
    }
}
