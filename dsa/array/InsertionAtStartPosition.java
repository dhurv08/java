package dsa.array;

import java.util.Scanner;

public class InsertionAtStartPosition {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] a = new int[10];
        System.out.print("Enter how many elements you want to enter in ARRAY = ");
        int n = scanner.nextInt();
    
        //Input ARRAY
        System.out.println("Enter "+ n +" numbers in the Array : ");
        for(int i = 0; i<n ;i++){
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the new element = ");
        int element = scanner.nextInt();
        System.out.println("Inserting the new element at Start position");

        //Insertion Part 
        if(n == 0){
            System.out.println("The Array is full and we need to implement the New Pointer Array Method");
        }else {
            for(int i = n-1 ; i >=0 ; i--){
                a[i+1] = a[i];
            }
            a[0] = element;
            n = n+1;
        }


        System.out.print("The new Array is : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(a[i] + "\t");
        }
        scanner.close();
    }
}
