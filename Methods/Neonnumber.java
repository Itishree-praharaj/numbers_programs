import java.util.Scanner;

public class Neonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b= sc.nextInt();
        for (int i = a; i <=b; i++) {
            if(isNeonnumber(i))System.out.println(i);
        }
    }

    static int sqr(int i){
        int sqr =i*i;
        return sqr;
    }

    static int sumOfDigits(int i){
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }

    static boolean isNeonnumber(int a){
        return sumOfDigits(sqr(a))==a;
    }
}
