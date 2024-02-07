import java.util.Scanner;

public class Buzznumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isBuzznumber(i))System.out.println(i);
        }
    }

    static int lastDigit(int n) {
        int ld = n % 10;
        return ld;
    }

    static boolean isBuzznumber(int n) {
        return (lastDigit(n) == 7) || (n % 7 == 0);
    }
}
