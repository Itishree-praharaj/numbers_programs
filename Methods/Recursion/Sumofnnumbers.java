import java.util.Scanner;

public class Sumofnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The total sum is " + sum(num, num2));
    }

    static int sum(int i, int e) {
        if (i > e)
            return 0;
        return i + sum(i+1, e);
    }
}
