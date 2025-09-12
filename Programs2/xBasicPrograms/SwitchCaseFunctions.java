package Programs2;

import java.util.Scanner;

public class SwitchCaseFunctions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char run = 'Y';
        while (run == 'Y' || run == 'y') {
            int a, b;
            System.out.print("Enter a = ");
            a = scanner.nextInt();
            System.out.print("Enter b = ");
            b = scanner.nextInt();

            func(a, b);

            System.out.println("\nDo you want to continue?\nPress Y - Yes\nPress any alphabet/number for - No");
            System.out.print("User Input = ");
            run = scanner.next().charAt(0);
        }
        scanner.close();
    }

    public static void func(int a, int b) {
        int choice;
        System.out.println("Choose the options : ");
        System.out.println("1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division\n5 : Modulus");
        choice = scanner.nextInt();

        switch (choice) {
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
    }
}
