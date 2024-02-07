import java.util.Scanner;

public class Sphenicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // for (int i = a; i <=b; i++) {
        //     if(isSphenicnumber(i))System.out.println(i);
        // }

        isSphenicnumber(42);
    }

    static boolean prime(int i) {
        if (i <= 1)
            return false;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    static boolean isSphenicnumber(int i) {
        int primecount = 0;
        int prod = 1;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                if (prime(i)) {
                    primecount++;
                }
                if(primecount>3)break;
                else
                prod *= i;
            }
            System.out.println("prod"+prod);
        }
        return prod==i;
    }
}
