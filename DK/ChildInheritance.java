//Create any function which demonstrates use of Inheritance

class Parent{
	
	void func1(){
	System.out.println("Parent class is called");
	}
}

class ChildInheritance extends Parent{
	public static void main(String args[]){
		ChildInheritance obj = new ChildInheritance();
		obj.func1();
		
		System.out.println("Child class is called");
		
		}
		
}