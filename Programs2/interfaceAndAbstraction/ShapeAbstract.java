package Programs2.interfaceAndAbstraction;

public class ShapeAbstract {
    public static void main(String[] args) {
        A a = new A();
        a.parameter();
        a.area();
    }
}
abstract class Shape{
    abstract public void area();        //abstract method
    public void parameter(){            //non - abstract method
        System.out.println("Parmeter Method Called ");
    }
}
class A extends Shape{
    public void area(){
        System.out.println("Area Method Called");
    }
}
