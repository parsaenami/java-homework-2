package ir.aut.homework2.hw2;

public class Rectangle {
    private double A;
    private double B;

    public void setA(double a) {
        A = a;
    }

    public void setB(double b) {
        B = b;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double perimeter() {
        return 2 * (A + B);
    }

    public double area() {
        return A * B;
    }

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double a, double b) {
        A = a;
        B = b;
    }

    public boolean isEqual(Rectangle rectangle) {
        return A == rectangle.A && B == rectangle.B;
    }

    public enum distinguishRecFromSq {
        SQUARE,
        RECTANGLE,
    }

    public boolean isSquare() {
        return A == B;
    }

    public distinguishRecFromSq distinguish() {
        if (isSquare())
            return distinguishRecFromSq.SQUARE;
        else
            return distinguishRecFromSq.RECTANGLE;
    }
}