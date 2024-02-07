import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(prime(a, 2));
    }

    static boolean prime(int n, int m) {
        if (m > n / 2)
            return true;
        if (n <= 1)
            return false;
        if (n % m == 0)
            return false;
        else
            return prime(n, m + 1);
    }
}
