import java.util.Scanner;
import java.util.ArrayList;

// Aggregation
class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        this.age = age;
    }

    void printValues() {
        System.out.println("Name = " + name + ", Age = " + age);
    }
}

class EncapPart22 {
    public static void main(String args[]) {

        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();
        Scanner dhruv = new Scanner(System.in);
        Scanner dhruv2 = new Scanner(System.in);

        for (int i = 0 ; i < 5; i++) {
            
            System.out.print("Enter Name: ");
            String userEnteredName = dhruv.nextLine();
            System.out.print("Enter Age: ");
            int userEnteredAge = dhruv2.nextInt();
            Student obj = new Student(userEnteredName, userEnteredAge);
            arrayOfStudents.add(obj);
            
        }
        dhruv.close();
        dhruv2.close();

        for (int i = 0; i < arrayOfStudents.size(); i ++) {
            Student data = arrayOfStudents.get(i);
            data.printValues();
        }
        
        // for (Student data: arrayOfStudents) {
        //     data
        // }
    }
}
