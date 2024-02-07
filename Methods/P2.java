import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        pattern2(rows);
    }

    static void pattern2(int r){
        for (int i = 1; i <=r; i++) {
            for(int j=1;j<=r-(i-1);j++){
                System.out.print(j+"\t");
            }
            for(int j=1;j<i;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<i;j++){
                System.out.print("*\t");
            }
            for(int j=r-(i-1);j>=1;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
