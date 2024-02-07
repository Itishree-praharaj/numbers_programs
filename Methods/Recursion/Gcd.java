import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greatestCommonDivisor(a, b));
    }

    static int greatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0)
            return a + b;
        int g = (a > b) ? a : b;
        int l = (a < b) ? a : b;
        int rem = g % l;
        return greatestCommonDivisor(l, rem);
    }
}
