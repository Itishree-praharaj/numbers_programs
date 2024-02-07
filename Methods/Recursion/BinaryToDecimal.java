import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number ");
        long b = sc.nextLong();
        System.out.println(bToD(b, 1));
    }

    static long bToD(long l, int prod) {
        if (l == 0)
            return 0;
        long sum = prod * (l % 10);
        prod *= 2;
        return sum + bToD(l / 10, prod);
    }
}
