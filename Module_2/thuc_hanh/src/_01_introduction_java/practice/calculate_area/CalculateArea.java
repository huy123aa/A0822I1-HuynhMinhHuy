package _01_introduction_java.practice.calculate_area;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài: ");
        float height = Float.parseFloat(scanner.nextLine()); //Lấy 1 string rồi chuyển về float
        System.out.println("Mời nhập chiều rộng: ");
        float width = Float.parseFloat(scanner.nextLine());
        float area = height * width;
        System.out.println("Diện tích là: "+ area);
    }
}
