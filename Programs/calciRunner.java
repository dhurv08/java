public class calciRunner{
    public static void main(String args[]){
        calci.sum();
        calci c = new calci();
        c.sub();
    }
}
class calci{
    public static void sum(){
        System.out.println("Welcome to Sum");
    }
    public void sub(){
        System.out.println("Welcome to Sub");
    }
}