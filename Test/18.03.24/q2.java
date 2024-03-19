/*Write a Java program to get the character at the given index within the string.
Sample Output:Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i */
public class q2 {
    public static void main(String[] args) {
        String str = "dhruv kumra";
        for(int i = 1 ; i <= (str.length()-1) ; i++){
            System.out.println("The character at position " + i + " is " + str.charAt(i));
        }

        int i1 = 0;
        int i2 = 10;

        System.out.println("Original String = " + str);

        char c1 = str.charAt(i1);
        System.out.println("\n\nThe character at position " + i1 + " is " + c1);

        char c2 = str.charAt(i2);
        System.out.println("The character at position " + i2 + " is "+c2);
}    
}