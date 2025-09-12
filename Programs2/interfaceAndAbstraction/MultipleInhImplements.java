package Programs2.interfaceAndAbstraction;

public class MultipleInhImplements {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        shape.parameter();
    }
}
interface Rectangle{
    public  void area();
}
interface Circle{
    public void parameter();
}
class Shape implements Rectangle , Circle{
    public void area(){
        System.out.println("Interface Area Called");
    }
    public void parameter(){
        System.out.println("Interface Parameter Called");
    }
}