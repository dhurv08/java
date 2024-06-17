package Programs2.inheritance;

/*person class 
  4 fields ;
 student and teacher class with 2 fields each 
 set and print data 

 with normmal functions 
 override(super keyword)
 constructors
 */


//WITH NORMAL FUNCTION
public class PersonNormalFunction {
  private int id;
  private String name;
  private String address;
  private double contact;

  void setDataP(int id, String name, String address, double contact) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.contact = contact;
  }

  void printDataP() {
    System.out.println("\nID = " + id);
    System.out.println("Name = " + name);
    System.out.println("Address = " + address);
    System.out.println("Contact = " + contact);

  }
  //Student extends Person
  public class Student extends PersonNormalFunction {
    private int classs;
    private String course;

    void setDataS(int classs, String course) {
      this.classs = classs;
      this.course = course;

    }

    void printDataS(){
      System.out.println("Class = "+ classs);
      System.out.println("Course = " + course);

    }

  }
  //Teacher extends Person
  public class Teacher extends PersonNormalFunction {
    private int salary;
    private String qualification;

    void setDataT(int salary, String qualification) {
      this.salary = salary;
      this.qualification = qualification;

    }

    void printDataT(){
      System.out.println("Class = "+ salary);
      System.out.println("Course = " + qualification);

    }

  }
  //Main function
  public static void main(String[] args) {
    PersonNormalFunction personNormalFunction = new PersonNormalFunction();
    Student s1 = personNormalFunction.new Student();
    Teacher t1 = personNormalFunction.new Teacher();

   s1.setDataP(716, "dhruv", "Jalandhar", 419802);
   s1.setDataS(3,"B.Tech");
   s1.printDataP();
   s1.printDataS();

   t1.setDataP(213, "null", "Jalandhar", 129486);
   t1.setDataT(150000, "Masters in CS");
   t1.printDataP();
   t1.printDataT();
    
  }

  }

