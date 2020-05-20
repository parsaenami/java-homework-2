package ir.aut.homework2.hw2;

public class Triangle {
    private double A;
    private double B;
    private double C;

    public void setA(double a) {
        A = a;
    }

    public void setB(double b) {
        B = b;
    }

    public void setC(double c) {
        C = c;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public boolean isEquilateral() {
        return A == B || A == C || B == C;
    }

    public boolean isIsosceles() {
        return A == B && A == C && B == C;
    }

    public enum type {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
    }

    public type triangleType() {
        if (isEquilateral())
            return type.EQUILATERAL;
        else if (isIsosceles())
            return type.ISOSCELES;
        else
            return type.SCALENE;
    }

    public Triangle() {
        this(0, 0, 0);
    }

    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public boolean isEqual(Triangle triangle) {
        return A == triangle.A && B == triangle.B && C == triangle.C;
    }

    public double perimeter() {
        return A + B + C;
    }

    public double area() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}