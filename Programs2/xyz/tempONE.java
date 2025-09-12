package Programs2.xyz;

// package Programs2;

import java.util.Scanner;
public class tempONE{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData();
        System.out.println("__Details of student 1__");
        s1.printData();
    }
}

class Student{
    int id;
    String name;
    Address address = new Address();
    DOB dob = new DOB();
    void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student id = ");
        id = scanner.nextInt();
        System.out.print("Enter Student name = ");
        name = scanner.next();
        address.getData();
        dob.getData();

    }

    void printData(){
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        address.printData();
        dob.printData();
    }
}
class Address{
   

    String city;
    String state;
    String country;
    void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter City = ");
        city = scanner.next();
        System.out.print("Enter State = ");
        state = scanner.next();
        System.out.print("Enter Country = ");
        country = scanner.next();
    }
    void printData(){
        System.out.println("Address = " + city + " , " + state + " , " + country);
    }

}
class DOB{
    int day;
    int month;
    int year;

    void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of birth = ");
        day = scanner.nextInt();
        System.out.print("Enter month of birth = ");
        month = scanner.nextInt();
        System.out.print("Enter year of birth= ");
        year = scanner.nextInt();
    }
    void printData(){
        System.out.println("DOB in DD:MM:YY = " + day + ":" + month + ":" + year);
    }
}

