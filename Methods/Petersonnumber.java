import java.util.Scanner;

public class Petersonnumber {
    static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }

    static boolean isPetersonnumber(int a){
        int sum=0;
        int num=a;
        while(a>0){
            sum+=factorial(a%10);
            a/=10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            if(isPetersonnumber(i))System.out.println(i);
        }
    }
}
