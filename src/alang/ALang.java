package alang;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

import antlr.collections.Stack;

public class ALang {
	public static void main(String[] args) throws Exception {
		if(args.length==0){
			System.out.println("enter name of file for compilation, please");
			return;
		}
		ALang t = new ALang();
		if(new File(args[0]).isFile()){
			t.run(args);
		}
		else{
			System.out.println("file "+args[0]+" not found");
		}
	}
	
	public void run(String[] args) throws Exception{
        ANTLRFileStream fileStream = new ANTLRFileStream(args[0]);
        ALangLexer lexer = new ALangLexer(fileStream);
	    TokenStream tokenStream = new CommonTokenStream(lexer);
		ALangParser parser = new ALangParser(tokenStream);
		
		RuleReturnScope r = parser.program();
		CommonTree tree = (CommonTree) r.getTree();
		System.out.println(tree.toStringTree());
		ArrayList<String> tmp = new ArrayList<String>();
		java.util.Stack<String> tt = new java.util.Stack<String>();
		//tmp.remove(tmp.size()-1);
//		for(String s: parser.errors){
//			System.err.println(s);
//		}
//		
//		if(parser.errors.isEmpty()){
//			FileWriter outWr = new FileWriter("GraphLangProgram.java");
//            outWr.write(r.getTemplate().toString());
//            outWr.close();
//		}
	}

}
