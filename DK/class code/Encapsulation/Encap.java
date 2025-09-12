import java.util.Scanner;

class Encap {

    private String name;
    private String password = "O7";

    String getName(String password) {
        if (this.password.equals(password)) {
            return name;
        }
        return "";
    }
    
    void setName(String password, String name) {
        System.out.println("Inside set," + password);
        if (this.password.equals(password)) {
            this.name = name;
        } else {
            System.out.println("Password incorrect");
        }
    }
}

class EncapPart2 {
    public static void main(String args[]) {
        Encap obj = new Encap();
        // System.out.println(obj.name);
        // obj.name = "Sid";

        // Integer i1 = new Integer(10);
        // Integer i2 = new Integer(10);

        // // if (i1.intValue() == i2.intValue()) {
        // if (i1.equals(i2)) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }


        Scanner dhruv = new Scanner(System.in);
        System.out.println("Enter Password to set Name:");
        String password = dhruv.nextLine();
        obj.setName(password, "ABABABABABABAB");

        System.out.println("Enter Password to get Name:");
        password = dhruv.nextLine();
        System.out.println(obj.getName(password));

        dhruv.close();
    }
}
