import java.util.Scanner;

public class SolidDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a  = sc.nextInt();
        diamond(a);
    }

    static void diamond(int r){
        for(int i=1;i<=r*2;i++){
            if(i<=r){
                for(int j=i;j<r;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=r+1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(r*2)-(i-1);j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
