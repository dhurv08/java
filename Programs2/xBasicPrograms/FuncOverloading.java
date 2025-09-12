package Programs2;

// Illustrate function overloading by giving relevant example.
public class FuncOverloading {
    public static void main(String[] args) {
        int a, b;
        a = add(10, 20);
        b = add(10, 20, 30);

        System.out.println("Sum of two numbers: " + a);
        System.out.println("Sum of three numbers: " + b);
    }

    static int add(int x, int y) {
        return (x + y);
    }

    static int add(int x, int y, int z) {
        return (x + y + z);
    }
}
