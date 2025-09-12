package Programs2.xyz;

import java.util.Scanner;
/*### Problem Statement

Develop a simple Java program to manage a list of students in a classroom. The program should allow for the following functionalities:

1. **Add a Student:**
   - Add a new student to the classroom.
   - Each student should have a name and an ID.
   - Ensure that the classroom has a limited capacity, and prevent adding more students than the capacity allows.

2. **Display All Students:**
   - Display the details (name and ID) of all students currently in the classroom.

### Requirements

1. **Student Class:**
   - Create a `Student` class with attributes for the student's name and ID.
   - Include a constructor to initialize these attributes.
   - Provide methods to get the student's name and ID.
   - Provide a method to display the student's details.

2. **Classroom Class:**
   - Create a `Classroom` class that manages an array of `Student` objects.
   - Include a method to add a student to the classroom.
   - Ensure the classroom does not exceed its capacity when adding students.
   - Include a method to display all students in the classroom.

3. **Main Class:**
   - Demonstrate the functionality by creating instances of `Student` and adding them to an instance of `Classroom`.
   - Display the details of all students in the classroom. */

// public class ProbStat1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n;
//         System.out.println("Enter number of classes: ");
//         n = scanner.nextInt();
//         Classroom[] classrooms = new Classroom[n];
//         System.out.println("Enter classrooms deatils :");
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter class name and capacity:");
//             classrooms[i] = new Classroom(scanner.next(), scanner.nextInt());
//         }

//         int a;

//         do {
//             System.out.println();
//             System.out.println("------------------------------------------------  ");
//             System.out.println("Enter your choice");
//             System.out.println("1. Add a student");
//             System.out.println("2. Display list of students");
//             System.out.println("3. Exit");
//             a = scanner.nextInt();

//             switch (a) {
//                 case 1:
//                     System.out.println("------------------------------------------------  ");
//                     System.out.println("Choose a classroom ");
//                     for (int i = 0; i < n; i++) {
//                         System.out.println(i + ": " + classrooms[i].name);
//                     }
//                     System.out.println("------------------------------------------------  ");

//                     int classIndex = scanner.nextInt();
//                     classrooms[classIndex].addStudent();
//                     break;
//                 case 2:
//                     for (int i = 0; i < n; i++) {
//                         System.out.println();
//                         System.out.println("------------------------------------------------ ");
//                         System.out.println("Class " + classrooms[i].name + " Details");
//                         System.out.println("------------------------------------------------ ");

//                         classrooms[i].print();
//                     }
//                     break;
//                 case 3:
//                     System.out.println("Thank you");
//             }
//         } while (a < 3);

//     }
// }

// class Student {
//     Scanner scanner = new Scanner(System.in);
//     // int strength;
//     private String name;
//     private int id;
//     Student(){}

//     Student(int id, String name) {
//         // strength = 100;
//         this.id = id;
//         this.name = name;
//     }

//     void setData(){
//         System.out.print("Enter id = ");
//         id = scanner.nextInt();
//         System.out.print("Enter name = ");
//         name = scanner.next();
//     }

//     void printData() {
//         System.out.printf("%-5d %-5s /n", id, name);
//     }
// }

// class Classroom {
//     String name;
//     int capacity;
//     Student s1[];
//     int n;
//     int count = 0;

//     Classroom() {

//     }

//     Classroom(String n, int c) {
//         name = n;
//         capacity = c;
//         s1 = new Student[capacity];

//     }

//     Classroom(int c) {
//         capacity = c;
//         s1 = new Student[capacity];

//     }

//     void addStudent() {

//         if (count >= capacity) {
//             System.out.println("----Classroom capacity has been reached----");
//         } else {
//             s1[count] = new Student();
//             s1[count].setStudent();
//             count++;

//         }
//     }

//     void print() {
//         if (count == 0) {
//             System.out.println("No students");
//         } else {
//             System.out.printf("%-4s%-10s%n", "ID", "NAME");
//             System.out.println("------------------------------------------------ ");
//             for (int i = 0; i < count; i++) {
//                 // s1[i]=new Student();
//                 s1[i].printStudent();
//             }
//         }

//     }
// }
import java.util.Scanner;
class ProbStat1
{
    public static void main(String [] arg)
    {
       Scanner sc=new Scanner(System.in);
       int n;
       System.out.println("Enter number of classes: ");
       n= sc.nextInt();
       Classroom []classrooms=new Classroom[n];
       System.out.println("Enter classrooms deatils :");
       for (int i=0; i<n; i++)
       {
               System.out.println("Enter class name and capacity:");
               classrooms[i]= new Classroom(sc.next(),sc.nextInt());
       } 
   
       int a;

        
         do {
          System.out.println();
             System.out.println("------------------------------------------------  ");
             System.out.println("Enter your choice");
             System.out.println("1. Add a student");
             System.out.println("2. Display list of students");
             System.out.println("3. Exit");
             a=sc.nextInt();
         
             switch(a)
             {
              case 1: 
                System.out.println("------------------------------------------------  ");
                 System.out.println("Choose a classroom ");
                for(int i=0; i<n;i++)
                {
                  System.out.println(i + ": "+classrooms[i].name);
                }
                 System.out.println("------------------------------------------------  ");
       
                  int classIndex = sc.nextInt();
                   classrooms[classIndex].addStudent();                
                break;
              case 2:
               for(int i=0; i<n;i++)
                {
                   System.out.println();
                   System.out.println("------------------------------------------------ ");
                  System.out.println("Class "+ classrooms[i].name+ " Details");
                  System.out.println("------------------------------------------------ ");
           
                  classrooms[i].print();
                }
                 break;
              case 3:
                System.out.println("Thank you");
              }
             }while(a<3);
       
     }
}


class Student
{
    private int id;
    private String name;
    Student()
    {}

    Student(int i,String n)
    {
        id=i;
        name=n;
    }

    void setStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" STUDENT ID : ");
        System.out.println(" ");
        id=sc.nextInt();
        System.out.print("STUDENT NAME : ");
        System.out.println(" ");
        name=sc.next();
    }
    void printStudent()
    {        
        System.out.printf("%-4d%-10s%n",id,name);  
    }
}

    class Classroom
    {
         String name;
         int capacity;
         Student s1[];
         int n;
         int count=0;
        Classroom()
        {

        }
         Classroom(String n ,int c)
        {   name=n;
            capacity=c;
            s1=new Student[capacity];

        }
        Classroom(int c)
        {
            capacity=c;
            s1=new Student[capacity];

        }
        void addStudent()
        {   
           
          if(count>=capacity)
            {
             System.out.println("----Classroom capacity has been reached----");
            }
            else{
                    s1[count]=new Student();
                    s1[count].setStudent();  
                    count++;
                
                 }  
        }

        void print()
        {
          if(count==0)
          {
            System.out.println("No students");
          }
          else{
                    System.out.printf("%-4s%-10s%n","ID","NAME");
                    System.out.println("------------------------------------------------ ");
            for(int i=0;i<count;i++)
            { 
                //s1[i]=new Student();
               s1[i].printStudent();
            }
          }
          
        }
    }