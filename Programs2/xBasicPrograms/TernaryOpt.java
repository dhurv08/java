package Programs2;
//greatest of 3 no's using ternary operator
public class TernaryOpt {
    public static void main(String[] args) {
        int a = 5 , b = 10 , c = 15 ;
        int  greatest = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        System.out.println("greatest of three numbers is = " + greatest);
    
    }
}
