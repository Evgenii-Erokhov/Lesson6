package Lesson6.Animal;

public class Animal {
    protected String name;
    protected double distance;
    protected int maxrun;
    protected int maxswim;

    public Animal(String name) {
        this.name = name;
    }

    public double run(double distance) {
        this.distance = distance;
        return distance;
    }

    public double swim(double distance) {
        this.distance = distance;
        return distance;
    }
}
