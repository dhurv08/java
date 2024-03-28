package abstraction;
public class abstractExtended extends abstractClassq1{
    @Override
    public void name(){
        System.out.println("My name is dhruv");
    }
    
    public void newFunction(){
        super.newFunction();
        System.out.println("hi");
    }
    int a;

    public static void main(String args[]){
        abstractExtended obj = new abstractExtended();
        obj.name();
        obj.newFunction();  
        System.out.println("Value of a = " + obj.a);
    }
}