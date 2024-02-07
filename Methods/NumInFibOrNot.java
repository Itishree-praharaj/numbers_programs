import java.util.Scanner;

public class NumInFibOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int fib = 0;
        int firstnum=0;
        int secondnum=1;
        boolean present=false;
        System.out.print(firstnum+" ");
        System.out.print(secondnum+" ");
        while (fib <= n) {
            fib = firstnum+secondnum;
            System.out.print(fib+" ");
            if(n==fib){
                present=true;
                break;
            }
            firstnum=secondnum;
            secondnum=fib;
        }

        if(present)System.out.println("The entered number is present in the fibonacci series ");
        else System.out.println("The entered number is not present in fibonacci series ");
    }
}
