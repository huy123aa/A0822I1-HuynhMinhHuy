package _02_loop.in_so_nguyen_to_duoi_100;

public class DisplayPrimeNumberSmallerThan100 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) {
        int n = 2;
        while (n < 100){
            if (isPrime(n)){
                System.out.println(n);
            }
            n++;
        }
    }
}
