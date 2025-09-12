package Programs2;

import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    int i, n;
    Scanner scanner = new Scanner(System.in);
    boolean isPrime = true;
    System.out.print("Enter the number = ");
    n = scanner.nextInt();

    for (i = 2; i < n; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime == true) {
      System.out.println("Number is prime");
    } else {
      System.out.println("Number is not prime");
    }

    scanner.close();
  }
}
