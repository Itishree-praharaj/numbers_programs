import java.util.Scanner;

public class RightArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        rightArrow(r);
    }

    static void rightArrow(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == (r / 2) + 1 || j - i == r / 2 || i + j == (r * 2) - r / 2) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
