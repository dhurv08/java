//Input different type of variable and show in the console
import java.util.Scanner;
public class scannerDiffDatatype{
    public static void main(String args[]){
        int a;
        float b; 
        double c ; 
        char d ; 
        boolean e;
        String f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the int value of a = ");
        a = scanner.nextInt();
        System.out.print("Enter the float value of b = ");
        b = scanner.nextFloat();
        System.out.print("Enter the double value of c = ");
        c = scanner.nextDouble();
        System.out.print("Enter the char value of d = ");
        d = scanner.next().charAt(0);
        System.out.print("Enter the boolean value of e = ");
        e = scanner.nextBoolean();
        System.out.print("Enter the string value of f = ");
        f = scanner.next();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        scanner.close();
    }
}