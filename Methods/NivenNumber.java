import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if (niven(a))
            System.out.println("It is a niven number");
        else
            System.out.println("It is not a niven number");
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    static boolean niven(int n) {
        return n % sum(n) == 0;
    }

}
