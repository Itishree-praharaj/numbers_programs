import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (armStrong(num))
            System.out.println("It is an armstrong num");
        else
            System.out.println("It is not a armstrong num");
    }

    static int count(int i) {
        if (i == 0)
            return 0;
        return 1 + count(i / 10);
    }

    static int pow(int i, int p) {
        if (p == 0)
            return 1;
        return i * pow(i, --p);
    }

    static boolean armStrong(int i) {
        int count = count(i);
        int sum = 0;
        int num = i;
        while (i > 0) {
            sum += pow(i % 10, count);
            i /= 10;
        }
        return sum == num;
    }
}
