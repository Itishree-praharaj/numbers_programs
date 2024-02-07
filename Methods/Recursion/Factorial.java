import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc . nextInt();
        System.out.println(fact(num));
    }

    static int fact(int i) {
        if (i == 0 || i == 1)
            return 1;
        return i * fact(i - 1);
    }
}
