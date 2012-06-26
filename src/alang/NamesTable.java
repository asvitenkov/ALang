package alang;






import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;




public class NamesTable {
	private ArrayList<String> types;
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
	private TypeChecker typeChecker = new TypeChecker();
	private ArrayList<String> callCoroutineStack = new ArrayList<String>();
	private ArrayList<Integer> callCoroutineStackLines = new ArrayList<Integer>();
	
	public void addCallCoroutine(String name, int line){
		callCoroutineStack.add("coroutine_"+name);
		callCoroutineStackLines.add(line);
	}
	
	public boolean checkCallCoroutine(){
		boolean result = true;
		int i=0;
		for(String tmp: callCoroutineStack){
			if(!this.isExistCoroutine(tmp)){
				errors.add("line "+callCoroutineStackLines.get(i).toString()+": undefined yield coroutine");
				result = false;
			}
			i++;
		}
		return result;
	}
	
	public String getLastError(){
		if(!errors.isEmpty())
			return errors.pop();
		else return "";
	}
	
	public void addCoroutine(Coroutine c){
		//System.out.println(c);
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
		//System.out.println(n);
		if(!variableNames.containsValue(n))
			variableNames.put(n.idtf, n);
	}
	
	public void printVars(){
		Collection<VariableName> t= variableNames.values();
		System.out.println("\n\n\n");
		for(VariableName tmp: t){
			System.out.println(tmp.toString());
		}
		//System.out.println();
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
	
	public boolean isExistVariable(ArrayList<String> blocks, String name){
		boolean result = false;
		for(String tmp: blocks){
			if(isExistVariable(tmp, name)) {return true;}
		}
		return result;
	}
	
	public String getVariableBlock(ArrayList<String> blocks, String name){
		for(String tmp: blocks){
			if(isExistVariable(tmp, name)) {return tmp;}
		}
		return "";
	}
	
	public boolean checkAssignOperation(String block,String vName, String rType,int line){
		//boolean result = true;
		//if(vName.equals("a"))this.printVars();
		//System.out.println("block:"+block+" var name:"+vName+" right type:"+rType+" line:"+line);
		if(!isExistVariable(block, vName)) {errors.add("line "+line+": checkAssignOperation - variable doesn't exists"); return false; }
		
		VariableName var = getVariable(block, vName);
		if(var==null) {errors.add("line "+line+": checkAssignOperation - variable doesn't exists"); return false; }
		String vType = var.getType();
		if(vType.equals("undef")){
			if(!types.contains(rType)){
				errors.add("line "+line+": type mismatch - right expression have undefined type");
				return false;
			}
			else{
				var.setType(rType);
				return true;
			}
		}
		else if(types.contains(vType)){
			if(types.contains(rType)){
				if(typeChecker.checkTypes(vType, rType)){
					var.setType(typeChecker.getResultType("+", vType, rType));
					return true;
				}
				else{
					errors.add("line "+line+": type mismatch - right expression have type " +rType+", but need "+vType);
					return false;
				}
			}
			else{
				errors.add("line "+line+": type mismatch - right expression have undefined type");
				return false;
			}
		}
		else{
			errors.add("line "+line+": type mismatch - right expression have undefined type");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
	}
	{
		types = new ArrayList<String>();
		types.add("int"); types.add("string"); types.add("float");
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.printVars();
		super.finalize();
	}
}
