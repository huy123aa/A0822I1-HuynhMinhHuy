package _13_thuat_toan_tim_kiem.tim_kiem_nhi_phan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Mời nhập phần tử thứ  " + (i + 1));
            arr.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Nhập số cần tìm: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.print("Số cần tìm nằm ở vị trí: ");
        System.out.println(binarySearch(arr, 0, arr.size() - 1, value));
    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {
        int mid = (left + right) / 2;
        while (left <= right) {
            if (array.get(mid) == value) {
                return mid;
            } else if (array.get(mid) < value) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }
}
