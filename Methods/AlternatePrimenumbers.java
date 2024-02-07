import java.util.Scanner;

public class AlternatePrimenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(prime(i)){
                count++;
                if(count%2!=0)System.out.println(i);
            }
        }
    }

    static boolean prime(int n){
        if(n<=1)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
