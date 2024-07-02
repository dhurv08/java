package dsa.searchSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to Enter = ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        System.out.println("Enter "+n+" elements = ");

        for(int i = 0 ; i<n ; i++){
            a[i] = scanner.nextInt();
        }

        int sortedArray[] = bubbleSort(a);

        System.out.print("Sorted Array = ");
        for(int i = 0 ; i<n ;i++){
            System.out.print(sortedArray[i] + " ");
        }
        scanner.close();
    }
    static int [] bubbleSort(int a[]){
        int size = a.length;
        for(int i = 0 ; i< size -1 ; i++){
            for (int j = 0 ; j<size-i-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
