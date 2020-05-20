package ir.aut.homework2.hw5;

import java.util.Arrays;

public class Machine {
    private double speed;
    private String owner;
    private long carCode;
    private static double MaxSpeed;
    private double Degree;
    private int carCounter = 0;

    public double getDegree() {
        return Degree;
    }

    public void setDegree(double degree) {
        this.Degree = degree;
    }

    public Machine(String owner) {
        this.owner = owner;
        carCounter++;
    }

    public Machine() {
        this("");
    }

    public double getHighSpeed() {
        return MaximumSpeed();
    }

    public void setHighSpeed(double highSpeed) {
        Machine.MaxSpeed = highSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    private double[] carSpeed = new double[20];

    public void highSpeedArr(Machine machine) {
        carSpeed[carCounter] = machine.speed;
        carCounter++;
    }

    public double MaximumSpeed() {
        Arrays.sort(this.carSpeed);
        this.MaxSpeed = carSpeed[carCounter--];
        return MaxSpeed;
    }

    public enum turning {
        TURN_RIGHT,
        TURN_LEFT,
        NOT_TURNED,
    }

    public double turn() {
        return Degree;
    }

    public turning turnDirect() {
        if (turn() < 0)
            return turning.TURN_RIGHT;
        else if (turn() > 0)
            return turning.TURN_LEFT;
        else
            return turning.NOT_TURNED;
    }

    public String toString() {
        return getSpeed() + " " + getDegree() + " " + getOwner() + " " + getCarCode();
    }
}
