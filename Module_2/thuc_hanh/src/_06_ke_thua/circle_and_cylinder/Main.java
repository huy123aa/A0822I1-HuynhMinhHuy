package _06_ke_thua.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "blue");
        Cylinder cylinder = new Cylinder(5, "red", 10);
        System.out.println(circle1.toString());
        System.out.println(cylinder.toString());
    }
}
