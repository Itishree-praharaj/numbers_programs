import java.util.Scanner;

public class SumofEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println(sumOfEven(a));
    }

    static int sumOfEven(int n){
        if(n==0)return 0;
        if(n%2==0)return n+sumOfEven(n-1);
        else return sumOfEven(n-1);
    }
}
