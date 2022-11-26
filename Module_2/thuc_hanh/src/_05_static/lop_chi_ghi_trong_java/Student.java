package _05_static.lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classs = "C02";

    public Student() {

    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getName() {
        return this.name;
    }

    public String getClasss() {
        return this.classs;
    }
}
