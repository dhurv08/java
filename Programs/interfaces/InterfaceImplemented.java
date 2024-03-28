package interfaces;
public class InterfaceImplemented implements Interfaceq1{
    @Override
    public void fuelType(){
        System.out.println("This car works on Petrol");
    }

    public void newFun(){
        System.out.println("My name is dhruv");
    }

    public static void main(String[] args) {
        InterfaceImplemented interfaceq1 = new InterfaceImplemented();
        interfaceq1.fuelType();
        interfaceq1.newFun();
    }

}