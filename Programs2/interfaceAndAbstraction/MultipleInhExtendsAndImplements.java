package Programs2.interfaceAndAbstraction;

public class MultipleInhExtendsAndImplements {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        shape.parameter();
    }
}

abstract class Rectangle{
    public abstract void area();
}
interface Circle{
    public void parameter();
}
class Shape extends Rectangle implements Circle{
    public void area(){
        System.out.println("Abstract Area Called");
    }
    public void parameter(){
        System.out.println("Interface Parameter Called");
    }
}
