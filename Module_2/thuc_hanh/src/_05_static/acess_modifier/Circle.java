package _05_static.acess_modifier;

public class Circle {
    private double radius;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
