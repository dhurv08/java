/*Create 2 Classes:- 
1. Class One = it will have 2 variables in it int a and double c, then 2 constructors, one function which will print value of variables
                          - one constructor with int and double parameters, assign parameter values to Global Variable
                          - one constructor with no parameters, call other constructor with default Values

                          - printValues function will print values of a and c

2. Class Two = it will have main method, create 2 objects of ClassOne one with Parameters and other without parameters, then call printValues function*/
class One{	
	int a;
	double c;
		
	One(int a , double c){ 
		//paramatrized values
		this.a = a;
        this.c = c;
		}
		
		One(){
        //default values
        this(0, 0.0);
		}
	
	void printfunctionOne(){
		System.out.println("a = " + a);
		System.out.println("c = " + c);
	}
}
	
class Two{
	public static void main(String args []){
	// Creating an object of ClassOne with parameters
        One obj1 = new One(10, 3.14);
        obj1.printfunctionOne();

        System.out.println(); // Adding a line break

        // Creating an object of ClassOne without parameters
        One obj2 = new One();
        obj2.printfunctionOne();
	}
}