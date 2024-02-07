import java.util.Scanner;

public class SmallestNumUsingTernaryOperator {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The smallest number is "+smallest(a, b, c));
    }

    static int smallest(int a, int b, int c) {
        int small = (a <= b) ? a : b;
        small = (small <= c) ? small : c;
        return small;
    }
}
