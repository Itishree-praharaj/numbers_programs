import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        fib(0, 1, 1, num);
    }

    static int fib(int first, int second, int third, int count) {
        if (count < 0)
            return 0;
        System.out.println(first);
        third = first + second;
        first = second;
        second = third;
        return fib(first, second, third, --count);
    }
}
