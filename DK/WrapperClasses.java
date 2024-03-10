class WrapperClasses{
	public static void main(String args []){
		
     int a= 30;
    //Wrapper classes
	//Integer i = new Integer(30);                       //Integer has been deprecated as it is not Auto Boxing
	Integer i = 40;
	if(a == i){
		System.out.println("Integer Datatypes are equal");
	}else{
		System.out.println("Integer Datatypes are not equal");
	}
	
	float b = 100;           
	Float j = 100.0f;
	if(b == j){
		System.out.println("Float Datatypes are equal");
	}else{
		System.out.println("Float Datatypes are not equal");
	}
	
	
	char c = 'a';
	Character k = 'b';
	if(c == k){
		System.out.println("Character Datatypes are equal");
	}else{
		System.out.println("Character Datatypes are not equal");
	}
	
	
	boolean d = true;
	Boolean l = false;
	if(d == l){
		System.out.println("Boolean Datatypes are equal");
	}else{
		System.out.println("Boolean Datatypes are not equal");
	}
	
	}
	
	
	
	
}