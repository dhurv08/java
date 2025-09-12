//Create 4 different functions for 4 Arithimatic operations
class ArithimaticOperations{
public static void main(String args []){
		functionAdd();
		functionSub(20);
		
		int a= functionMultiply();
		System.out.println(a);	
		
		int b= functionDivide(10 , 20);
		System.out.println((b));
	
	}
	//No Return Type - No params 
	static void functionAdd(){
	System.out.println("No Return Type - No params = "+ (10+20));
	}
	
	//No Return Type - With params 
	static void functionSub(int a ){
		System.out.println("No Return Type - With params = " + a);
	}
	
	//With return type - No params
	static int functionMultiply(){
		System.out.print("With return type - No params = ");
		return (10*20);
	}
	
	//With Return Type - With Params 
	static int functionDivide(int a , int b){
		System.out.print("With Return Type - With Params = ");
		return (a/b);
	}
	
}