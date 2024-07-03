package dsa.searchSort;

import java.util.Scanner;

public class MeritList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Student Details you want to enter = ");
        int n = scanner.nextInt();
        Student [] student = new Student[n];

        for(int i = 0 ; i<n ;i++){
            System.out.println("__Student "+(i+1)+"__");
            student[i] = new Student();
            student[i].setData();
        }
        sort(student);
            // for (int i = 0; i < n - 1; i++) {
            //     for (int j = 0; j < n - i - 1; j++) {
            //         if (student[j].totalMarks < student[j + 1].totalMarks) {
            //             Student temp = student[j];
            //             student[j] = student[j + 1];
            //             student[j + 1] = temp;
            //         }
            //     }
            // }
    
        System.out.printf("%-10S%-10S%-10S%-10S%n","ID",  "Name",  "Course" , "Total Marks");
        // System.out.printf();
        
        for (int i = 0 ; i<n ; i++) {
            student[i].printData();
        }
        scanner.close();
    }
    static  void sort(Student[] students){  
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].totalMarks < students[j + 1].totalMarks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
}
}
class Student{
    int id;
    String name;
    String course;
    int totalMarks;

    void setData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id of Student = ");
        this.id = scanner.nextInt();
        System.out.print("Enter the Total Marks of Student = ");
        this.totalMarks = scanner.nextInt();
        System.out.print("Enter the name of Student = ");
        this.name = scanner.next();
        System.out.print("Enter the Course of Student = ");
        this.course = scanner.next();

    }
 
    void printData(){
        System.out.printf("%-10d %-10s %-10s %-10d\n", id, name, course, totalMarks);
    }
}
