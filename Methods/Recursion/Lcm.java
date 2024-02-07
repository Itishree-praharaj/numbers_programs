import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=(a>b)?a:b;
        System.out.println(lcm(a,b,h));
    }

    static int lcm(int i,int j,int l){
        if(l%i==0&&l%j==0)
        return l;
        else 
        return lcm(i, j, ++l);
    }
}
