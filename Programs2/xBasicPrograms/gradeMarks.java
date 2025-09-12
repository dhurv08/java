package Programs2;

import java.util.Scanner;

public class gradeMarks {
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


        if(result >= 91)
        {
            System.out.println("You achived grade A*");
        }else if(result >=81 && result <= 90)
        
        {
            System.out.println("You achived grade A");
        }else if (result >= 71 && result <=80)
        {
            System.out.println("You achived grade B");
        }else if (result >= 61 && result <=70)
        {
            System.out.println("You achived grade C");
        }else if (result >= 51 && result <=60)
        {
            System.out.println("You have achived grade D");   
        }else
        {
            System.out.println("You have achived grade F");
        }
        
        scanner.close();

    }
}
