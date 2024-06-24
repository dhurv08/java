package Programs2.classes;

import java.util.Scanner;

public class CircumfranceClassesObjs {
    private double radius;

    CircumfranceClassesObjs(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        CircumfranceClassesObjs circle = new CircumfranceClassesObjs(radius);

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Circumference of the circle: " + circle.circumference());

        scanner.close();
    }
}