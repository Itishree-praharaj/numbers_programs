import java.util.Scanner;

public class SumOfAllOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sood(a, b));
    }

    static int sood(int i, int b) {
        if (i < b)
            return 0;
        if (i % 2 != 0)
            return i + sood(i - 1, b);
        else
            return 0 + sood(i - 1, b);
    }
}
