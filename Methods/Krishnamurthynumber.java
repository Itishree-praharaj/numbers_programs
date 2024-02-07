import java.util.Scanner;

public class Krishnamurthynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(kmn(i))System.out.println(i);
        }
    }

    static int fact(int i) {
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial;
    }

    static boolean kmn(int i){
        int sum=0;
        int num=i;
        while(i>0){
            sum+=fact(i%10);
            i/=10;
        }
        return sum==num;
    }
}
