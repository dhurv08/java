package Programs2.inheritance;
//Constructor
public class PersonConstructor {
    private int id;
    private String name;
    private String address;
    private double contact;

    PersonConstructor(int id, String name, String address, double contact){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
    void printData() {
        System.out.println("\nID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("Contact = " + contact); 
      }
    
    //Student extends Person
      public class Student extends PersonConstructor{
        private int classs;
        private String course;

        Student(int id, String name, String address, double contact,int classs, String course){
            super(id, name, address, contact);
            this.classs = classs;
            this.course = course;
        }
        
        void printData(){
            super.printData();
            System.out.println("Class = "+ classs);
            System.out.println("Course = " + course);
        
            }
      }

//Teacher extends Person
public class Teacher extends PersonConstructor {
    private int salary;
    private String qualification;

    Teacher(int id, String name, String address, double contact,int salary, String qualification){
    super(id, name, address, contact);
    this.salary = salary;
    this.qualification = qualification;
    }

    void printData(){
      super.printData();
      System.out.println("Class = "+ salary);
      System.out.println("Course = " + qualification);
    
}
}
//main function
public static void main(String[] args) {
    PersonConstructor personConstructor = new PersonConstructor(0 , "" , "", 0.0);

    Student s1 = personConstructor.new Student(716, "dhruv", "Jalandhar", 32742, 3, "B.Tech");
    Teacher t1 = personConstructor.new Teacher(213, "xyz", "Jalandhar", 2174, 213, "P.hd Maths");

    s1.printData();
    t1.printData();
}
}