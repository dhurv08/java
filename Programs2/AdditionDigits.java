package Programs2;
import java.util.Scanner;
/*Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5*/
public class AdditionDigits {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = scanner.nextInt();

        int lastDigit = a%10;
        a = a/10;
        int secondLastDigit = a%10;

        int sum = lastDigit + secondLastDigit;
        System.out.println("Sum of last two digits of a number = " + sum);
        scanner.close();

     }
}
