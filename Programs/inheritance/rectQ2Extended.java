package inheritance;

public class rectQ2Extended extends rectangleQ2{
    public static void main(String[] args) {
        rectangleQ2 obj = new rectangleQ2();
        rectangleQ2 obj2 = new rectangleQ2(10,20);
        rectangleQ2 obj3 = new rectangleQ2(30);

        System.out.println("Area of rectangle with no params = " + obj.calculate());
        System.out.println("Area of rectangle with 2 params = " + obj2.calculate());
        System.out.println("Area of rectangle with 1 param = " + obj3.calculate());
    }
}
