package _06_ke_thua.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height= height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return super.getArea() * height;
    }
    public String toString(){
        return "Hình trụ này có chiều cao là: "+getHeight()+" và có thể tích là: "+volume();
    }
}
