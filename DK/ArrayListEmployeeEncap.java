//Array of objects- Employee class with 3 fields - id name , designation and  print details of 5 employees
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
	private int id;
	private String name;
	private String designation;
	
	Employee(int id , String name , String designation){
	this.id=id;
	this.name = name;
	this.designation= designation;
	}
	
	void printValues() {
        System.out.println("ID = " + id + ", Name = " + name + " , Designation = " + designation);
    }
}
class ArrayListEmployeeEncap{
	public static void main(String args[]){
		ArrayList<Employee> arrayOfEmployee = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("Enter the Number of Employee = ");
		int a = scan.nextInt();
		
		for(int i=0 ; i<a ; i++){
			System.out.println("Enter ID =");
			int userDefinedId = scan.nextInt();
			System.out.println("Enter Name =");
			String userDefinedName = scan2.nextLine();
			System.out.println("Enter Designation =");
			String userDefinedDesignation = scan3.nextLine();
			
			Employee obj = new Employee(userDefinedId , userDefinedName , userDefinedDesignation);
			arrayOfEmployee.add(obj);
		}
		
		for(int i=0 ; i<arrayOfEmployee.size() ; i++){
			Employee data = arrayOfEmployee.get(i);
			data.printValues();
		}
	
	}
	
}