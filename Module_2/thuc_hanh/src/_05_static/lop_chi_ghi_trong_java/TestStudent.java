package _05_static.lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Huy");
        student1.setClasss("A08");
        System.out.println("Tên học sinh: "+student1.getName()+" học lớp: "+student1.getClasss());
    }
}
