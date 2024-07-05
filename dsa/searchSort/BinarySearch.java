package dsa.searchSort;
//Search an element from array using binary search.
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] a = new int[100];
        System.out.print("Enter the number of elements you want to Enter = ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" elements = ");
        for(int i = 0 ; i<n ; i++){
            a[i] = scanner.nextInt();
        }

        int sortedArray[] = bubbleSortEX(a ,n);

        System.out.print("Enter the element to Search = ");
        int element = scanner.nextInt();

        int index = binarySearchEX(sortedArray, element , n);
        if(index == -1){
            System.out.println("Element is not found in the array");
        }else{
            System.out.println("Element found at index = "+ index);
        }
        scanner.close();
    }    
    static int binarySearchEX(int a[] , int element , int n){
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == element)
                return mid;
            if (a[mid] < element)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    static int [] bubbleSortEX(int a[] , int n){
        // int size = a.length;
        for(int i = 0 ; i< n -1  ; i++){
            for (int j = 0 ; j<n - i - 1 ; j++){
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
