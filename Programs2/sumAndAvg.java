package Programs2;
import java.util.Scanner;
public class sumAndAvg {
    public static void main(String[] args) {
    int sub1 , sub2 , sub3 ,result ;
        Scanner scanner = new Scanner(System.in);

    System.out.println("__Enter the numbers out of 100 only__");

    System.out.println("Enter the marks obtained in subject 1 :");
    sub1 = scanner.nextInt();
    System.out.println("Enter the marks obtained in subject 2 :");
    sub2 = scanner.nextInt();
    System.out.println("Enter the marks obtained in subject 3 :");
    sub3 = scanner.nextInt();
    
    result =(int) ((float)((sub1 + sub2 + sub3)*100) /300);
    System.out.println("Average = " + (sub1 + sub2 + sub3)/ 3);
    System.out.println("Total marks = " + (sub1 + sub2 + sub3) + "/300");
    System.out.println("Percentage obtained = " + result);

    scanner.close();
    }
}
