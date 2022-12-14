package _07_Abstrat_class_and_Interface.interface_resizeable_cho_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "vàng", false);
        shapes[1] = new Rectangle(x, x, "xanh", true);
        shapes[2] = new Square(x, "lục", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
