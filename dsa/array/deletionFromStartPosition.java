package dsa.array;

import java.util.Scanner;

public class deletionFromStartPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements you want to enter in the ARRAY = ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        //Input the array
      System.out.println("Enter "+ n +" numbers in the Array : ");
        for(int i = 0 ; i<n ;i++){
            a[i] = scanner.nextInt();
        }

        System.out.print("\nBefore Deletionn , this Array is : ");
        for(int i = 0 ; i < n ; i++){
          System.out.print(a[i] + "\t");
        }

        //Deletion Part
        System.out.println("__Deleting the First Element__");
        if(n == 0){
            System.out.println("Array is Empty");
        }else{
            for(int i = 0 ;i <n-1 ;i++){
                a[i] = a[i+1];
            }
            n = n-1;

            System.out.print("After Deletion the Array is : ");
            for(int i = 0 ; i<n ; i++){
                System.out.print(a[i] + "\t");
            }
        }
        scanner.close();
    }
}
