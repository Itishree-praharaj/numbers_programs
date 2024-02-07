import java.util.Scanner;

public class DiagonalAndSidesOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        rec(rows);
    }
    static void rec(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(i==j||i==1||j==1||j==r||i==r||(i+j==r+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
