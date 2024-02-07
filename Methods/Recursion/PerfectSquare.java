import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if(perfect(a))System.out.println("It is a perfect square");
        else System.out.println("It is not a perfect square");
    }

    static boolean perfect(int n){
        double sqrt=Math.sqrt(n);
        double num=Math.floor(sqrt);
        return sqrt==num;
    }
}
