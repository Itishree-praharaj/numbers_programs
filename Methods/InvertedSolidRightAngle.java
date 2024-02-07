import java.util.Scanner;

public class InvertedSolidRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        invertedSoliRight(rows);
    }

    static void invertedSoliRight(int r){
        for (int i = 1; i <=r; i++) {
            for (int j = r; j>=i; j--) {
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
