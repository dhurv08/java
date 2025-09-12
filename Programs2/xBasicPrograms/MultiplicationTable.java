import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int number = scanner.nextInt();

        printMultiplicationTable(number);

        scanner.close(); // Closing the scanner to prevent resource leak
    }

    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
