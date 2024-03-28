package interfaces;
import abstraction.abstractClassq1;
// package abstraction;
public class ExtendAndImplementation extends abstractClassq1 implements Interfaceq1{
    public void name(){
        System.out.println("My name is dhurv");
    }
    public void newFunction(){
        System.out.println("In abstract class new funtion");
    }
    public void fuelType(){
        System.out.println("This car runs on Petrol");
    }
    public void newFun(){
        System.out.println("In interface class new funtion");
    }

    public static void main(String args[]){
        ExtendAndImplementation extendAndImplementation = new ExtendAndImplementation();
        extendAndImplementation.name();
        extendAndImplementation.newFunction();
        extendAndImplementation.fuelType();
        extendAndImplementation.newFun();

    }
}