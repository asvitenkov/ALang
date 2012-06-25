package alang;




import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;




public class NamesTable {
	public class VariableName {
		private String 	idtf;
		private String	type;
		private int	lineDeclaration;
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
		public void setType(String type){
			this.type = type;
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
	private HashMap<String, Coroutine> coroutinenNames = new HashMap<String, Coroutine>();
	private HashMap<String, VariableName> variableNames = new HashMap<String, VariableName>();
	private Stack<String> errors = new Stack<String>();
	public String getLastError(){
		if(!errors.isEmpty())
			return errors.pop();
		else return "";
	}
	
	public void addCoroutine(Coroutine c){
		System.out.println(c);
		coroutinenNames.put(c.idtf, c);
	}
	
	public boolean isExistCoroutine(String name){
		return coroutinenNames.containsKey(name);
	}
	
	public boolean isExistVariable(String block, String varName){
		boolean rv=variableNames.containsKey(block+"."+varName);
		if (! rv ){
			rv = variableNames.containsKey("global"+"."+varName);
		}
		return rv;
	}
	
	public void addVariable(VariableName n) {
		System.out.println(n);
		variableNames.put(n.idtf, n);
	}
	
	public void printVars(){
		System.out.println(variableNames);
	}
	
	public VariableName getVariable(String block, String name) {
		VariableName _n = variableNames.get(block+"."+name); 
		if (_n == null) {

				_n = variableNames.get("global."+name);
		}
		return _n;
	}
	
	
	public String getVariableType(String block, String name){
		String type="undef";
		if(isExistVariable(block, name)){
			type = getVariable(block, name).getType();
		}
		return type;
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
