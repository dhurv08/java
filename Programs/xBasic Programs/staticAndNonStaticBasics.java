class staticAndNonStaticBasics{
    int a= 10;
    static int b = 20;
    public static void main(String args[]){
        staticAndNonStaticBasics s = new staticAndNonStaticBasics();
        s.gaurav();
        sharma();

        System.out.println(s.a);
        System.out.println(b);

        Dog.bark();
        Dog d = new Dog();
        d.sleep();
    }
    public static void sharma(){
        System.out.println("Welcome to sharma Fun");
    }

    public void gaurav(){
        System.out.println("Welcome to Gaurav");
    }
}
class Dog{
    static void bark(){
        System.out.println("Bow Bow");
    }

    void sleep(){
        System.out.println("Sleeps at night");
    }
}