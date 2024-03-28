package interfaces;
//Create 2 interfaces and implement in a single class

public class MultipleImplements implements Interfaceq1 , Interface2{
    public void fuelType(){
        System.out.println("This car works on Petrol");
    }

    public void newFun(){
        System.out.println("In Interface q1");
    }

    public void Address(){
        System.out.println("I live in jalandhar");
    }

    public void Funn(){
        System.out.println("In Interface q2");
    }

    public static void main(String[] args) {
        MultipleImplements multipleImplements = new MultipleImplements();
        multipleImplements.fuelType();
        multipleImplements.newFun();
        multipleImplements.Address();
        multipleImplements.Funn();

    }
}
