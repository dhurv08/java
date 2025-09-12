package Programs2.interfaceAndAbstraction;

public class InterfaceShape {
    public static void main(String[] args) {
        C c = new C();
        c.area();
        c.parameter();
    }
}
public interface ShapeAr {
    public void area();    
}
public interface ShapePa {
    public void parameter();
}
class C implements ShapeAr , ShapePa{
    public void area(){
        System.out.println("Area Method Called");
    }
    public void parameter(){
        System.out.println("Parameter Method Called");
    }

}