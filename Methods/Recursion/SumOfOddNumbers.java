import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number till which you want the sum ");
        int a = sc.nextInt();
        System.out.println(sumofodd(a));
    }

    static int sumofodd(int n){
        if(n==0)return 0;
        if(n%2!=0)return n+sumofodd(n-1);
        else return sumofodd(n-1);
    }
}
