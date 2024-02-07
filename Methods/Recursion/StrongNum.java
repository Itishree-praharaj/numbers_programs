import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num == strongNum(num))
            System.out.println("It is a strong num");
        else
            System.out.println("It is not a armstrong num");
    }

    static int fact(int i) {
        if (i == 1 || i == 0)
            return 1;
        return i * fact(--i);
    }

    static int strongNum(int i) {
        if (i == 0)
            return 0;
        return fact(i % 10) + strongNum(i / 10);
    }
}
