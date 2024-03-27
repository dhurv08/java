package abstraction;
public class abstractExtended extends abstractClassq1{
    @Override
    void name(){
        System.out.println("My name is dhruv");
    }
    
    void newFunction(){
        // super.newFunction();
        System.out.println("hi");
    }

    super.a;

    public static void main(String args[]){
        abstractExtended obj = new abstractExtended();
        obj.name();
        obj.newFunction();
        System.out.println("Value of a = " + obj.a);
    }
}