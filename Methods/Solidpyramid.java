import java.util.Scanner;

public class Solidpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=  sc.nextInt();
        pyramid(rows);
    }

    static void pyramid(int r){
        int stars=1;
        for(int i=1;i<=r;i++){
            for(int j=r;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
            stars+=2;
        }
    }
}
