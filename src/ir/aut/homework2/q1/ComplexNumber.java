package ir.aut.homework2.hw1;

public class ComplexNumber {
    private double R;
    private double I;
    private int complexCounter = 1;

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double real, double image) {
        R = real;
        I = image;
        complexCounter++;
    }

    public ComplexNumber add(ComplexNumber complexCalc) {
        ComplexNumber complexCalc1 = new ComplexNumber();
        complexCalc1.R = this.R + complexCalc.R;
        complexCalc1.I = this.I + complexCalc.I;
        return complexCalc1;
    }

    public ComplexNumber sub(ComplexNumber complexCalc) {
        ComplexNumber complexCalc1 = new ComplexNumber();
        complexCalc1.R = this.R - complexCalc.R;
        complexCalc1.I = this.I - complexCalc.I;
        return complexCalc1;
    }

    public ComplexNumber muliply(ComplexNumber complexCalc) {
        ComplexNumber complexCalc1 = new ComplexNumber();
        complexCalc1.R = this.R * complexCalc.R - this.I * complexCalc.I;
        complexCalc1.I = this.I * complexCalc.R + this.R * complexCalc.I;
        return complexCalc1;
    }

    public ComplexNumber divide(ComplexNumber complexCalc) {
        ComplexNumber complexCalc1 = new ComplexNumber();
        complexCalc1.R = (this.R * complexCalc.R - this.I * complexCalc.I) / (complexCalc.R * complexCalc.R + complexCalc.I * complexCalc.I);
        complexCalc1.I = (this.I * complexCalc.R + this.R * complexCalc.I) / (complexCalc.R * complexCalc.R + complexCalc.I * complexCalc.I);
        return complexCalc1;
    }

    public void setR(double r) {
        R = r;
    }

    public void setI(double i) {
        I = i;
    }

    public double getI() {
        return I;
    }

    public double getR() {
        return R;
    }

    public int getComplexCounter() {
        return complexCounter;
    }

    public boolean isEqual(ComplexNumber complexNumber) {
        return R == complexNumber.R && I == complexNumber.I;
    }

    public String toString() {
        if (this.getI() >= 0)
            return this.getR() + " + " + this.getI() + "i";
        else
            return this.getR() + " " + this.getI() + "i";
    }
}