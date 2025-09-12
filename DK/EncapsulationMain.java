//Encapsulation - student class with two fields name, roll 
import java.util.Scanner;
class Encapsulation{
	private String name;
	private int roll_number;
	
	// Encapsulation(String name , int roll_number){
		// this.name = name;
		// this.roll_number = roll_number;
	// }
	String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getRollNumber() {
        return roll_number;
    }
    void setRollNumber(int roll_number) {
        this.roll_number = roll_number;
    }
	
}
class EncapsulationMain{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Name =");
	String userEnteredName = scan.nextLine();
	System.out.println("Enter Roll Number =");
	int userEnteredRollNumber = scan.nextInt();
	
	// Encapsulation obj = new Encapsulation(userEnteredName , userEnteredRollNumber);
	
	//for using set function
	Encapsulation obj = new Encapsulation();
	obj.setName(userEnteredName);
	obj.setRollNumber(userEnteredRollNumber);
	
	System.out.println("Name = "+ obj.getName());
	System.out.println("Roll Number = "+obj.getRollNumber());
	
	}
}