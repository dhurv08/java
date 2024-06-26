package dsa.array;

import java.util.Scanner;

//Create two arrays for first names and last names, and merge them into one array full names. Implement it using functions
public class MergeOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstName = new String[1];
        String [] lastName = new String[1];

        System.out.print("Enter First Name = ");
        for(int i = 0 ; i<firstName.length ;i++){
            firstName[i] = scanner.next();
        }
        System.out.print("Enter Last Name = ");
        for(int i = 0 ; i<lastName.length ;i++){
            lastName[i] = scanner.next();
        }
        String fullName[] = merge(firstName, lastName);
        System.out.print("Full Name = ");
        for(int i = 0 ; i<lastName.length ; i++){
            System.out.print(fullName[i]);
        }
        scanner.close();
    }

    public static String[] merge(String[] x , String[] y){
        String [] fullname = new String[2];
        int size = x.length;
        for(int i = 0 ; i<size ; i++){
            fullname [i] = (x[i] + " " + y[i]);
        }
        return fullname;
    }
}
