import java.util.Scanner;

public class Technumber {
    static int count(int a) {
        int len = 0;
        while (a > 0) {
            len++;
            a /= 10;
        }
        return len;
    }

    static int sum(int a) {
        int div = 1;
        for (int i = 1; i <= count(a) / 2; i++) {
            div *= 10;
        }
        int num1 = a / div;
        int num2 = a % div;

        return num1 + num2;
    }

    static boolean isTechnumber(int a) {
        if (count(a) % 2 != 0)
            return false;
        return (sum(a) * sum(a)) == a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(count(2025));
        // System.out.println(sum(2025));
        for (int i = a; i <= b; i++) {
        //System.out.println(count(i));
        if (isTechnumber(i)) {
        System.out.println(i);
        }
        }
    }
}
