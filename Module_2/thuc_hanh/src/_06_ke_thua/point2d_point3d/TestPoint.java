package _06_ke_thua.point2d_point3d;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(5, 4);
        Point3D point2 = new Point3D(point1.getX(), point1.getY(), 8);
        System.out.println(point1);
        System.out.println(point2);
    }
}
