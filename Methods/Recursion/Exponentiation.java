import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println(exp(a, b));
    }

    static int exp(int b,int p){
        if(p<1)return 1;
       return b*exp(b, p-1);
    }
}
