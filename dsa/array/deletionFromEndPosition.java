package dsa.array;

import java.util.Scanner;

public class deletionFromEndPosition {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the elements you want in ARRAY = ");  
      int n = scanner.nextInt();

      int [] a = new int[n];
      //Input thr ARRAY 
      System.out.println("Enter "+ n +" numbers in the Array : ");
      for(int i = 0 ; i<n ; i++){
        a[i] = scanner.nextInt();
      }

      System.out.print("Before Deletionn , this Array is : ");
      for(int i = 0 ; i < n ; i++){
        System.out.print(a[i] + "\t");
      }
      
      //Deletion Part
      System.out.println("\n__Deleting the last element__");
      if(n == 0){
        System.out.println("Array is Empty");
      }else{
        n = n-1;                                            //Removes the last Element from the Array 

        System.out.print("After Deletion the Array is : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(a[i] + "\t");
        }
      }
      scanner.close();
    }
}
