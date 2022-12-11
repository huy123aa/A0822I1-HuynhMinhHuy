package _03_array_and_method_java.gop_mang;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cho mảng 1: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] mang1 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            mang1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Nhập số phần tử cho mảng 2: ");
        int b = Integer.parseInt(scanner.nextLine());
        int[] mang2 = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            mang2[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng 1: " + Arrays.toString(mang1));
        System.out.println("Mảng 2: " + Arrays.toString(mang2));

        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int j = 0; j < mang2.length; j++) {
            mang3[j + mang1.length] = mang2[j];
        }

        System.out.println("Mảng 3: " + Arrays.toString(mang3));
    }


}
