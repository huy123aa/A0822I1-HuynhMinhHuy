package _06_ke_thua.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*2*3.14;
    }
    public String toString(){
        return "Hình tròn có bán kính là: "+this.radius+" và có diện tích là: "+getArea();
    }
}
