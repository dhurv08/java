package Programs2.arrays;

import java.util.Scanner;

public class PersionDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons = ");
        int n = scanner.nextInt();
        Employee[] e1 = new Employee[n];

        for (int i = 0; i < n; i++) {
            e1[i] = new Employee();
            System.out.println("----Details of Person "+ (i+1) + " = ");    
            e1[i].setData(scanner); 
        }
        
        // Optionally, print out the details of each person
        System.out.println("Entered person details:");
        for (int i = 0; i < n; i++) {
            e1[i].printData();
        }
        
        scanner.close();
    }
}

class Employee {
    int id;
    String name;

    void setData(Scanner scanner) {
        System.out.print("Enter id = ");
        id = scanner.nextInt();
        System.out.print("Enter name = ");
        name = scanner.next();
    }

    void printData() {
        System.out.println(String.format("ID = " + id + "\t\tName = " + name));
    }
}
