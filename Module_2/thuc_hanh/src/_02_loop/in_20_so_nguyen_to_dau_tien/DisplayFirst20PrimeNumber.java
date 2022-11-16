package _02_loop.in_20_so_nguyen_to_dau_tien;

public class DisplayFirst20PrimeNumber {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n>1;
    }

    public static void main(String[] args) {
        int count = 0, n = 2;
        while (count < 20) {
            if (isPrime(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}