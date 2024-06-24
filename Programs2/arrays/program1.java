package Programs2.arrays;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avg = 0 , total = 0 , highest =0 ;
        // int marks [];
        System.out.print("Enter the number of marks you want to enter = ");
        int n = scanner.nextInt();
        int marks [] = new int[n];

        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter the marks of student " + (i +1) + " = ");
            marks[i] = scanner.nextInt();
            total += marks[i];
            avg = (total /n );
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Marks of student " + (i + 1) + " = " + marks[i]);
        }
        // System.out.println("Highest marks = ");
        for(int i = 0 ; i<n ; i++){
            if (marks[i] > highest ){
                highest = marks[i];
            } 
        }
        System.out.println("\nAverage marks = " + avg );
        System.out.println("\nHighest marks  = " + highest );
        scanner.close();
    }    
}

