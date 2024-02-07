import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the binary number");
        long bin=new Scanner(System.in).nextLong();
        System.out.println(bToD(bin));
    }
    static int bToD(long num){
        int prod=1;
        int sum=0;
        while(num>0){
            sum+=(num%10)*prod;
            num/=10;
            prod*=2;
        }
        return sum;
    }
}
