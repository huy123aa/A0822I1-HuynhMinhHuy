package _03_array_and_method_java.them_phan_tu_vao_mang;

import java.util.Scanner;

public class AddElementToArray {
    private static Scanner scanner = new Scanner(System.in);

    static void addArray(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] addElement(int[] arr, int n, int number, int index){
        int[] newArray = new int[n+1];
        newArray[index] = number;
        for(int i = 0; i< index; ++i){
            newArray[i] = arr[i];
        }
        for(int i = index + 1; i<n+1; ++i){
            newArray[i] = arr[i-1];
        }return newArray;
    }
    public static void main(String[] args) {

        int[] arr = new int[100];
        System.out.println("mời nhập số phần tử trong mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        addArray(arr, n);
        displayArray(arr, n);
        System.out.println("Bạn muốn thêm số ở vị trí nào? ");
        int index = Integer.parseInt(scanner.nextLine());
        if(index <0 || index >= arr.length){
            System.out.println("Không chèn được phần tử vào mảng!!!");
        }else{
            System.out.println("Nhập số bạn muốn chèn vào: ");
            int number = Integer.parseInt(scanner.nextLine());
            int[] newArr = addElement(arr, n, number, index);
            displayArray(newArr, n+1);
        }
    }
}
