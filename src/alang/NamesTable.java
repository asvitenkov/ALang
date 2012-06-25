package alang;




import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;




public class NamesTable {
	public class VariableName {
		private String 	idtf;
		private String	type;
		private int		lineDeclaration;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public VariableName(String idtf, String type, int line) {
			this.idtf = idtf;
			this.type = type;
			lineDeclaration = line;
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf + ", " + type + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
		public String getType() {
			return type;
		}
		
	}
	public class Coroutine {
		private String 	idtf;
		private int lineDeclaration;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public Coroutine(String idtf, int line) {
			this.idtf = idtf;
			lineDeclaration = line;
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
	}
	private HashMap<String, Coroutine> functionNames = new HashMap<String, Coroutine>();
	private HashMap<String, VariableName> variableNames = new HashMap<String, VariableName>();
	private Stack<String> errors = new Stack<String>();
	public String getLAstError(){
		if(!errors.isEmpty())
			return errors.pop();
		else return "";
	}
	public boolean isExistVariable(String name) {
		//System.out.println(name);
		boolean rv = variableNames.containsKey(name);
		if (! rv && name.indexOf('.')!=-1) {
			rv = variableNames.containsKey("global"+name.substring(name.indexOf('.')));
			if(!rv){
				// search variable name in functions names
				//System.out.println(name.substring(name.indexOf('.')+1).toString());
				rv = variableNames.containsKey(name.substring(name.indexOf('.')+1));
			}
		}
		return rv;
	}
	
	public boolean isDeclaredVariable(String name){
		boolean result = false;
		result = variableNames.containsKey(name);
//		if(result==false){
//			result = variableNames.containsKey("global"+name.substring(name.indexOf('.')));
//		}
		return result;
	}
	
	public void addVariable(VariableName n) {
		//System.out.println("Declaration var : "+n.idtf+" line " + n.lineDeclaration);
		variableNames.put(n.idtf, n);
	}
	
	public void printVars(){
		System.out.println(variableNames);
	}
	
	public VariableName getVariable(String n) {
		//System.out.println(n);
		VariableName _n = variableNames.get(n); 
		if (_n == null) {
			if (n.indexOf('.')==-1)
				_n = variableNames.get("global."+n);
			else 
				_n = variableNames.get("global"+n.substring(n.indexOf('.')));
		}
		return _n;
	}
	
	public void printVariable(PrintStream out) {
		for (String idtf : variableNames.keySet()) {
			VariableName n = variableNames.get(idtf);
			out.println(n);
		}
	}
	
	public void getAllErrors(ArrayList<String> list){
		while(!errors.isEmpty()){
			list.add(errors.pop());
		}
	}
	
	public static void main(String[] args) {
	}

}
