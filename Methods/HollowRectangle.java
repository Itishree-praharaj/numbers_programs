import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        rectangle(rows);
    }

    static void rectangle(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (j == r || j == 1 || i == 1 || i == r) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
