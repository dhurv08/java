package Programs2.interfaceAndAbstraction;

class ShapeEx
{
    public static void main(String[] args) {
       Shape s= new Rectangle();
       s.area();
       s.parameter();
       s= new Circle();
       s.area();
       s.parameter();
    }
}

interface Shape {
    public void area();   
    public void parameter();
}
class Rectangle implements Shape{
    public void area(){
        System.out.println("Area Method Called");
    }
    public void parameter(){
        System.out.println("Parameter Method Called");
    }
}
class Circle implements Shape{
    public void area(){
        System.out.println("Area Method Called");
    }
    public void parameter(){
        System.out.println("Parameter Method Called");
    }
}