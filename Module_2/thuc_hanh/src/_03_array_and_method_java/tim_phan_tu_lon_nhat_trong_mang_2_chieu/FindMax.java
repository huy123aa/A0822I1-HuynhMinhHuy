package _03_array_and_method_java.tim_phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột:");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử thứ " + i + "-" + j + ": ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng đã cho là: ");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất của mảng là: " + max);
    }
}
