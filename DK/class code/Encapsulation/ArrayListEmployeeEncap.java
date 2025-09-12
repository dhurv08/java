//Array of objects- Employee class with 3 fields - id name , designation and  print details of 5 employees
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
	private int id;
	private string name;
	private string designation;
	
	Employee(int id , string name , string designation){
	this.id=id;
	this.name = name;
	this.designation= designation;
	}
}
class ArrayListEmployeeEncap{
	public static void main(String args[]){
		ArrayList<Employee> arrayOfEmployee = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Employee = ");
		int a = scan.nextInt();
		
		for(int i=0 ; i<a ; i++){
			System.out.println("Enter ID =");
			int userDefinedId = scan.nextInt();
			System.out.println("Enter Name =");
			String userDefinedName = scan.nextLine();
			System.out.println("Enter Designation =");
			String userDefinedDesignation = scan.nextLine();
			
			Employee obj = new Employee(userDefinedId , userDefinedName , userDefinedDesignation);
			arrayOfEmployee.add(obj);
		}
		
	
	}
	
}