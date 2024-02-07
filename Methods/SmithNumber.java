import java.util.Scanner;

public class SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the range");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // for (int i = a; i <= b; i++) {
        //     if (smithNum(i))
        //         System.out.println(i);
        // }
        System.out.println(sumOfDigits(27));
        System.out.println(smithNum(27));
    }

    static boolean smithNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                if (primeNo(i)) {
                    sum += sumOfDigits(i);
                    System.out.println(i);
                }
            }
        }
        System.out.println("sum"+sum);
        return sum == sumOfDigits(n);
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean primeNo(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
