import java.util.Scanner;

public class HolllowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of rows ");
        int r= sc.nextInt();
        hollowRhombus(r);
    }

    static void hollowRhombus(int r){
        for (int i = 1; i <=r; i++) {
            for (int j = i; j <r; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <r; j++) {
                if(j==1||i==1||j==r-1||i==r){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
