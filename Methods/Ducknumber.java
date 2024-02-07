import java.util.Scanner;

public class Ducknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the range");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // for (int i = a; i <=b; i++) {
            if(isDuckno(070))System.out.println("yes");
            else System.out.println("no");
        // }
    }

    static int firstDigit(int n) {
        int div = 1;
        int num = n;
        while (n >= 9) {
            div *= 10;
            n /= 10;
        }

        int firstd = num / div;
        return firstd;
    }

    static boolean zero(int n){
        while(n>0){
            if(n%10==0) return true;
            n/=10;
        }
        return false;
    }

    static boolean isDuckno(int r){
        if(firstDigit(r)==0)return false;
        else if(zero(r))return true;
        return false;
    }
}
