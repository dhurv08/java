package Programs2;

import java.util.Scanner;
/* Input any 2 numbers and perform operation based on user choices:
    1. Addition
    2. Subtraction
    3. Multiplication
    4. Division
    5. Modulus
    6. Exit


After displaying results, display choices again. Repeat until user presses exit.*/
public class SwitchCase {
    public static void main(String[] args) {
        int a,b;
        int choice ;

        char run = 'Y';
        while (run == 'Y' || run == 'y'){
            // Repeat the program until user do not want to exit


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = " );
        a = scanner.nextInt();
        System.out.print("Enter b = ");
        b = scanner.nextInt();
    
        System.out.println("Choose the options : ");
        System.out.println("1 : Addition \n2 : Subtraction\n3 : Multiplication\n4 : Division\n5 : Modulas ");
        choice = scanner.nextInt();;
    
        switch (choice){
            case 1: 
            System.out.println("Addition = "+ (a+b));
            break;
    
            case 2:
            System.out.println("Subtraction = "+ (a-b));
            break;
    
            case 3:
            System.out.println("Multiplication = " + (a*b));
            break;
    
            case 4:
            System.out.println("Division = " + (a/b));
    
            case 5:
            System.out.println("Modulas = " + (a%b));
            break;
    
            default:
            System.out.println("Invalid Input");
        }
        System.out.println("\nDo you want to continue \nPress Y - Yes \nPress any alpabhet/number for - No "); 
        System.out.print("User Input = ");
    	run = scanner.next().charAt(0);   
    }
    }
    
}
