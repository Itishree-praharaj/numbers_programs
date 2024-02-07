import java.util.Scanner;

public class SpiralSquareUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            if(i%2!=0){
                int k=((i-1)*size)+1;
                for(int j=1;j<=size;j++){
                    System.out.print(k+"\t");
                    k++;
                }
            }
            else{
                int k=i*size;
                for (int j = 1; j <=size; j++) {
                    System.out.print(k+"\t");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
