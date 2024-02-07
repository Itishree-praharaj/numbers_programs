import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            if(isArmstrong(i))System.out.println(i);
        }
    }
    static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    static int pow(int a,int b){
        int prod=1;
        for (int i = 1; i <=b; i++) {
            prod*=a;
        }
        return prod;
    }
    static boolean isArmstrong(int a){
        int n=a;
        int sum=0;
        int len=count(n);
        while(n>0){
            int rem=n%10;
            sum+=pow(rem,len);
            n/=10;
        }
        return sum==a;
    }
}
