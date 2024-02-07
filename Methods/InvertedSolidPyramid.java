import java.util.Scanner;

public class InvertedSolidPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        InvertedPyramid(rows);
        Solidpyramid.pyramid(rows);
    }

    static void InvertedPyramid(int r){
        int stars=r+(r-1);
        for (int i = 1; i <=r; i++) {
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            stars-=2;
            System.out.println();
        }
    }
}
