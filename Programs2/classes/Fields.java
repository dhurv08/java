package Programs2.classes;

import java.util.Scanner;

public class Fields {
     static Scanner scanner = new Scanner(System.in);

    static class Stu {
        int rollNo;
        String name;
        int mobNo;
        String address;
        String Kundli;

        void getData() {
            System.out.print("Give roll number: ");
            this.rollNo = scanner.nextInt(); 
            scanner.nextLine(); 
            System.out.print("Give name: ");
            this.name = scanner.nextLine();
            System.out.print("Give mobile number: ");
            this.mobNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Give address: ");
            this.address = scanner.nextLine();
            System.out.print("Give Kundli: ");
            this.Kundli = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.getData();

        // Printing the values
        System.out.println("\nStudent Information:");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Name: " + s1.name);
        System.out.println("Mobile No: " + s1.mobNo);
        System.out.println("Address: " + s1.address);
        System.out.println("Kundli: " + s1.Kundli);
    }
}
