// package Programs2;

import java.util.Scanner;
public class Aggregationex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter Student id = ");
        s1.id = scanner.nextInt();
        System.out.println("Enter Student name = ");
        s1.name = scanner.nextLine();
        System.out.println("Enter City = ");
        s1.address.city = scanner.nextLine();
        System.out.println("Enter State = ");
        s1.address.state = scanner.nextLine();
        System.out.println("Enter Country = ");
        s1.address.country = scanner.nextLine();
        System.out.println("Enter day of birth = ");
        s1.dob.day = scanner.nextInt();
        System.out.println("Enter month of birth = ");
        s1.dob.month = scanner.nextInt();
        System.out.println("Enter year of birth= ");
        s1.dob.year = scanner.nextInt();
        
        s1.printData();
        scanner.close();
    }
}
class Student{
    int id;
    String name;
    Address address = new Address();
    DOB dob = new DOB();

    void printData(){
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address.city + " , " + address.state + " , " + address.country);
        System.out.println("DOB in DD:MM:YY = " + dob.day + ":" + dob.month + ":" + dob.year);
    }
}
class Address{
    String city;
    String state;
    String country;
}
class DOB{
    int day;
    int month;
    int year;
}
