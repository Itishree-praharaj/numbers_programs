import java.util.Scanner;

public class Emirpnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isEmirp(i))
                System.out.println(i);
        }
    }

    static boolean prime(int i) {
        if (i <= 1)
            return false;

        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0)
                return false;
        }

        return true;
    }

    static int reverse(int i) {
        int rev = 0;
        while (i > 0) {
            rev = (rev * 10) + i % 10;
            i /= 10;
        }
        return rev;
    }

    static boolean isEmirp(int i) {
        if (prime(i) == false)
            return false;

        return prime(i) & prime(reverse(i));
    }
}
