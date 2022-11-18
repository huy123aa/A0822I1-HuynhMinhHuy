package _03_array_and_method_java.tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;
import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập phần tử thứ  " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã cho: " + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("Phần tử nhỏ nhất là: " + min);
    }
}

