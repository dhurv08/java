//final class FinalKeyword {
class FinalKeyword {
    void finalNycFunction() {
        System.out.println("Inside FinalKeyword");
    }
}

class ChildClass extends FinalKeyword {
    public static void main(String args[]) {
        // FinalKeyword obj = new FinalKeyword();
        // obj.finalNycFunction(); //Parent
        // ChildClass obj = new ChildClass();
        // obj.finalNycFunction(); //Child = Overriding

        FinalKeyword obj = new ChildClass();

        final int a = 10;

        obj.finalNycFunction();
    }

    void finalNycFunction() {
        super.finalNycFunction();
        System.out.println("Inside ChildClass");
    }
}

