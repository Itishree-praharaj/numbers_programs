import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        hollowDiamond(rows);
    }

    static void hollowDiamond(int r){
        for(int i=1;i<=r*2;i++){
            if(i<=r){
                for(int j=1;j<=r-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1||j==i)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            }
            else{
                for(int j=1;j<i-r;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(r*2)-i+1;j++){
                    if(j==1||j==(r*2)-i+1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
