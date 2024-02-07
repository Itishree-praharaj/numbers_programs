import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if(pallin(num))System.out.println("it is a pallindrome number ");
        else System.out.println("It is not a pallindrome number");
    }

    static int rev(int n){
        if(n==0)return 0;
        int num=n;
        int div=1;
        while(n>9){
            div*=10;
            n/=10;
        }
        return (num%10)*div+rev(num/10);
    }

    static boolean pallin(int i){
        return rev(i)==i;
    }
}
