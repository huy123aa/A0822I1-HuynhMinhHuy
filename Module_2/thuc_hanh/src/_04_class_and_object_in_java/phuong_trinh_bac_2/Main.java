package _04_class_and_object_in_java.phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Mời nhập a: ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập b: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập c: ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation function = new QuadraticEquation(a,b,c);
        if(function.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(function.getDiscriminant() == 0){
            System.out.println("Phương trình đã cho có nghiệm kép: "+function.getRoot1());

        }else{
            System.out.println("Phương trình có 2 nghiệm phân biệt: "+function.getRoot1()+" và"+function.getRoot2());
        }
    }
}
