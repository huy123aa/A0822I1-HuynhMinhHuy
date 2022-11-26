package _04_class_and_object_in_java.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
        System.out.println("Bắt buộc phải truyền tham số");
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.a;
    }

    public double getC() {
        return this.a;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.sqrt(this.getDiscriminant()) / (2 * a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        }
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }
}
