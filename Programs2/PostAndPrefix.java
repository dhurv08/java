package Programs2;
//Illustrate diff btw prefix and postfix inc/dec
public class PostAndPrefix {
    public static void main(String[] args) {
    int a = 5,b;
    // a++;          //post increment
    // ++a;          //pre increment
   
    System.out.println("value of a : ");

    b=a++;          // this is post increment in which value of b will remain the same
    //b=++a;          // this is pre increment in which value of b will change


   System.out.println("Value of a : " + a);       
   System.out.println("Value of b : " + b );

   //------------------------------------------------------------------------------------------------------
  
  
//     // a--;          //post decrement
//     // --a;          //pre decrement
    
//    System.out.println("print value of a : ");

//      b=a--;          // this is post decrement in which value of b will remain the same
//     // b=--a;          // this is pre decrement in which value of b will change

//    System.out.println("Value of b : "+ b);

    }
}
