import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            int num=i;
            if(isPrimeNumber(num))System.out.println(i);
        }
    }

    static boolean isPrimeNumber(int a){
        if(a<=1)return false;
        
        for (int i = 2; i <=a/2; i++) {
            if(a%i==0)return false;
        }
        return true;
    }
}
