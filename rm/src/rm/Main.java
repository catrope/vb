/* test program for displaying the AST */

package rm;

import rm.lexer.*;
import rm.parser.*;
import rm.node.*;
import rm.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] arg) {
	try {
	    System.out.println("This is a test, type a legal expression:");
	    // Create a parser
        Parser p = new Parser(
                       new Lexer(
                       new PushbackReader(
                       new InputStreamReader(System.in), 1024)));

        // parse the input
         Start tree = p.parse();
         //ASTDisplay ad = new ASTDisplay ();
         //tree.apply (ad);
         tree.apply(new Interpreter());
            
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}

