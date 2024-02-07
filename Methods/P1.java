import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        pattern(rows);
    }

    static void pattern(int r) {
        for (int i = 1; i <= r; i++) {
            int num = r - (i - 1);
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(0);
                } else {
                    System.out.print(num);
                    num++;
                }
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(--num);
            }
            System.out.println();
        }
    }
}
