package Programs2.xBasicPrograms;

public class StringFunctions {
    public static void main(String[] args) {
        String x = "Hello World";
        System.out.println("Length = " + x.length());
        System.out.println("Char at index 3 = " + x.charAt(3));
        System.out.println("Substring from 2 - 7 = " + x.substring(2, 7));
        System.out.println("Index of W = " + x.indexOf("W"));
    }
}
