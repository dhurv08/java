package Programs2;
import java.util.Scanner;
//Input any number and check whether it is positive or negative.
public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is positive or negative = ");
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }else if(a<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is 0 , whiich is neither positive nor negative");
        }
        scanner.close();
    }
}
