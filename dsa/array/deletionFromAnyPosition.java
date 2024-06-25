package dsa.array;
import java.util.Scanner;
public class deletionFromAnyPosition {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter how many elements you want to enter in ARRAY = ");
    int n = scanner.nextInt();
    int [] a = new int[n];

    //Input in ARRAY
    System.out.println("Enter "+ n +" numbers in the Array : ");
    for(int i = 0; i<n ;i++){
        a[i] = scanner.nextInt();
    }

    System.out.print("Before Deletion the Array is : ");
    for(int i = 0 ; i<n ;i++){
        System.out.print(a[i]+"\t");
    }

    System.out.print("\nNow Enter the position from which you want to delete the element from the Array = ");
    int k = scanner.nextInt();


    //Deletion Part
    for (int i = k ; i< n-1 ; i++){           //we use k as the element which has to be deleted and run it till (n-1)position the reach the last element 
        a[i] = a[i+1];                        //use this to put the next element in previous location in the array
    }
    n = n-1;                                  //to cut down the extra storage space after deletion of one element 


    System.out.print("After Deletion the Array is : ");
    for(int i = 0 ; i<n ; i++){
        System.out.print(a[i] + "\t");
    }
    scanner.close();
    }
}
