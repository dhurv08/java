package inheritance;
/*
Create a class named Rectangle with two data members- length and breadth and a
function to calculate the area which is length*breadth. The class has three
constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that
number.
Now, create objects of the Rectangle class having none, one and two parameters
and print their areas.  
*/
public class rectangleQ2{
    public double length;
    public double breadth;

    public rectangleQ2(){
        this.length = 0;
        this.breadth = 0;
    }

    public rectangleQ2(double a , double b){
        this.length = a;
        this.breadth = b;
    }

    public rectangleQ2(double a){
        this.length = a;
        this.breadth = a;
    }
    public double calculate(){
        return length * breadth;
    }

    // public static void main(String[] args) {
    //     rectangleQ2 obj = new rectangleQ2();
    //     rectangleQ2 obj2 = new rectangleQ2(10,20);
    //     rectangleQ2 obj3 = new rectangleQ2(30);

    //     System.out.println("Area of rectangle with no params = " + obj.calculate());
    //     System.out.println("Area of rectangle with 2 params = " + obj2.calculate());
    //     System.out.println("Area of rectangle with 1 param = " + obj3.calculate());


    // }

}