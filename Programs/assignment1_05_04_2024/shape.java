package assignment1_05_04_2024;
public abstract class shape {

    double numSides;
    shape(double a){
        this.numSides =a;
    }
    public void getSide(double a){
        this.numSides =a;
    }

    abstract public void getArea();
    abstract public void getPerimeter();

}