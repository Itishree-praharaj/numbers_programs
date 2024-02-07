import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println(prime(n));
    }

    static int prime(int n){
        int count=0;
        int num=2;
        while(count<n){
            boolean prime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
            if(prime)count++;
            if(count==n)return num;
            num++;
        }
        return num;
    }
}
