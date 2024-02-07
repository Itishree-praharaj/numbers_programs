import java.util.Scanner;

public class NumRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        rightTriangle(rows);
    }

    static void rightTriangle(int r){
        int num=1;
        for (int i = 1; i <=r; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
