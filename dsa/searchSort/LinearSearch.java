package dsa.searchSort;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[100];
        System.out.print("Enter the number of elements you want to Enter = ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" elements = ");
        for(int i = 0 ; i<n ; i++){
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to Search = ");
        int element = scanner.nextInt();

        int index = LinearSearchEx(a , element);
        if(index == -1){
            System.out.println("Element is not found in the array");
        }else{
            System.out.println("Element found at index = "+ index);
        }
        scanner.close();
    }

    static int LinearSearchEx(int a[] , int element){
        int pos = -1;
        int index = 0 ;
        int size = a.length;

        for(int i =0 ; i<size ; i++){
            if(a[i] == element){
                pos = i;
                break;
            }
        }
        return pos;
    }
}