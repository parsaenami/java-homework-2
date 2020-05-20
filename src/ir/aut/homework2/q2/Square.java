package ir.aut.homework2.hw2;

public class Square {
    private double A;

    public Square() {
        this(0);
    }

    public Square(double a) {
        A = a;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double diameter() {
        return A * Math.sqrt(2);
    }

    public double perimeter() {
        return 4 * A;
    }

    public double area() {
        return A * A;
    }

    public boolean isEqual(Square square) {
        return A == square.A;
    }
}