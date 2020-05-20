package ir.aut.homework2.hw2;

public class Circle {
    private double R;
    public static final double PI = 13.14159;

    public Circle() {
        this(0);
    }

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public double perimeter() {
        return PI * R * 2;
    }

    public double area() {
        return PI * R * R;
    }

    public boolean isEqual(Circle circle) {
        return R == circle.R;
    }
}