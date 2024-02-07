import java.util.Scanner;

public class AlphabetRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        AlphabetTriangle(rows);
    }

    static void AlphabetTriangle(int r){
        for(int i=1;i<=r;i++){
            for (int j = 1; j<=i; j++) {
                System.out.print(""+(char)(64+i));
            }
            System.out.println();
        }
    }
}
