package _05_static.acess_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(5);
        System.out.println("Diện tích hình tròn 1 là: "+circle1.getArea());
        System.out.println("HÌnh tròn 2 có màu:  "+circle2.getColor());
    }
}
