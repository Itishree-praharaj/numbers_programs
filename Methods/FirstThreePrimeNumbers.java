import java.util.Scanner;

public class FirstThreePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(count>=3)break;
            if(prime(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    static boolean prime(int a){
        if(a<=1)return false;
        for(int i=2;i<=a/2;i++){
            if(a%i==0)return false;
        }
        return true;
    }
}
