import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isMagicnumber(i)){
                // System.out.println("rev"+rev(i));
                // System.out.println("sum"+sum(i));
                System.out.println(i);
            }
        }
    }
    static int sum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        // System.out.println("sum"+sum);
        return sum;
    }

    static int rev(int a){
        int rev=0;
        while(a>0){
            rev=(rev*10)+a%10;
            a/=10;
        }
        // System.out.println("rev"+rev);
        return rev;
    }

    static boolean isMagicnumber(int a){
        return ((rev(sum(a))*sum(a))==a);
    }
}
