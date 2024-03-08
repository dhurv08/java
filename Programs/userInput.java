import java.util.Scanner;
public class userInput {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.print("Enter the value of a = ");
        a = scanner.nextInt();
        System.out.print("Entered value of a is "+ a);

        scanner.close();

    }
}
