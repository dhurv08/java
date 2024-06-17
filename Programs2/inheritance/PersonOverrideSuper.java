package Programs2.inheritance;
//Override Method using Super Keyword
public class PersonOverrideSuper {
    private int id;
    private String name;
    private String address;
    private double contact;
  
    void setData(int id, String name, String address, double contact) {
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
    public class Student extends PersonOverrideSuper {
    private int classs;
    private String course;

    void setData(int id, String name, String address, double contact,int classs, String course) {
    super.setData(id, name, address, contact);
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
   public class Teacher extends PersonOverrideSuper {
    private int salary;
    private String qualification;

    void setData(int id, String name, String address, double contact,int salary, String qualification) {
    super.setData(id, name, address, contact);
    this.salary = salary;
    this.qualification = qualification;

    }

    void printData(){
      // System.out.println("__Teacher__");
    super.printData();
    System.out.println("Class = "+ salary);
    System.out.println("Course = " + qualification);

    }
}

//main function
public static void main(String[] args) {
  PersonOverrideSuper personOverrideSuper = new PersonOverrideSuper();
  Student s1 = personOverrideSuper.new Student();
  Teacher t1 = personOverrideSuper.new Teacher();

  s1.setData(716, "dhruv", "Jalandhar", 32742, 3, "B.Tech");
  t1.setData(213, "xyz", "Jalandhar", 2174, 213, "P.hd Maths");

  s1.printData();
  t1.printData();

 }
}
