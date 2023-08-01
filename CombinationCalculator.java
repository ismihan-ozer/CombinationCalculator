import java.util.Scanner;

public class CombinationCalculator {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını girin: ");
        int n = scanner.nextInt();

        System.out.print("k sayısını girin: ");
        int k = scanner.nextInt();

        if (n < 0 || k < 0 || k > n) {
            System.out.println("Hatalı giriş!");
        } else {
            int result = combination(n, k);
            System.out.println("C(" + n + ", " + k + ") = " + result);
        }
    }
}
