class Functions{
	static void stringCmp(String a , String b){
		String A =  a;
		String B =  b;
		System.out.println("Result of String Compare is = "+A.equals(B));
		
	}
	static void stringHashcode(String a){
		System.out.println("hashCode = " + a.hashCode());
	}
	static void stringIsEmpty(String a , String b){
		System.out.println("String Empty for "+ a + " is = "+a.isEmpty());
		System.out.println("String Empty for "+ b + " is = "+b.isEmpty());
	}
	static void stringToLowerCase(String a){
		System.out.println("Inputed String "+a+" is Converted to Lower Case as = "+a.toLowerCase());
	}
	static void stringLength(String a){
		System.out.println("Length of String "+a+ " is = " +a.length());
	}
	static void stringConcat(String a , String b){
		System.out.println("The concat of given two Strings is = "+ a.concat(b));
	}
	static void stringTrim(String a){
		System.out.println("The trimmed string is = "+a.trim());
	}
}

class StringFunctions{
	public static void main(String args[]){
	
	Functions.stringCmp("abcd","abc");
	Functions.stringHashcode("abcd");
	Functions.stringIsEmpty("aeIUBF","");
	Functions.stringToLowerCase("CAZKDJBFWI");
	Functions.stringLength("kjbew98fgiqvbdkq");
	Functions.stringConcat("Dhruv","Kumra");
	Functions.stringTrim("          wieufbw   uiqfw        ");
	}
}