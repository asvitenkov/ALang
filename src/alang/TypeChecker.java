package alang;

import java.util.ArrayList;

public class TypeChecker {
	private ArrayList<String> types = new ArrayList<String>();
	public TypeChecker() {
		// TODO Auto-generated constructor stub
	}
	public boolean checkTypes(String lType, String rType){
		if(lType.equals("error") || rType.equals("error")) return true;
		if(!types.contains(lType)||!types.contains(rType)){
			return false;
		}
		boolean result=true;
		if(!lType.equals(rType)){
			if(lType.equals("string")){
				return false;
			}
			if(lType.equals("int")){
				if(rType.equals("string")){
					return false;
				}
			}
			if(lType.equals("float")){
				if(rType.equals("string")){
					return false;
				}
			}
		}
		return result;
	}
	
	public boolean checkMathExpr(String lType, String rType){
		if(!types.contains(lType)||!types.contains(rType)){
			return false;
		}
		if(lType.equals("error") || rType.equals("error")) return true;
		boolean result=true;
		if(!lType.equals(rType)){
			if(lType.equals("string")){
				return false;
			}
			if(lType.equals("int")){
				if(rType.equals("string")){
					return false;
				}
			}
			if(lType.equals("float")){
				if(rType.equals("string")){
					return false;
				}
			}
		}
		return result;
	}
	
	public String getResultType(String op, String rType, String lType){
		if(lType.equals("error") || rType.equals("error")) return "error";
		
		if(!types.contains(lType)||!types.contains(lType)){
			return "undef";
		}
		
		String rv ="undef";
		if(!checkMathExpr(lType, rType)) return rv;
		if(rType.equals(lType)) rv = rType;
		if(rType.equals("int")&& lType.equals("int")&&op.equals("/")) rv="float";
		else rv="float";
		return rv;
	}
	{
		types.add("int"); types.add("string"); types.add("float");
	}
}
