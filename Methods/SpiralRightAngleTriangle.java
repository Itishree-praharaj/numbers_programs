import java.util.Scanner;

public class SpiralRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner( System.in);
        System.out.println("Enter the number of rows ");
        int r = sc.nextInt();
        int num=0;
        for (int i = 1; i <=r; i++) {
            if(i%2!=0){
                num+=1;
                for (int j = 1; j <=i; j++) {
                    System.out.print(num+"\t");
                    num++;
                }
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print(num+"\t");
                    num--;
                }
            }
            System.out.println();
            num+=i;
        }
    }
}
