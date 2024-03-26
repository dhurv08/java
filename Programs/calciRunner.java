/*create a class named calci which is having two function sum and sub just printing welcome to sum / sub make sum function as static 
create another class named calci runner , which is having main function to run the program , 
code in such a way that you call both function from calci class and make sure you dont call sum with object .dd
 */
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