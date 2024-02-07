import java.util.Scanner;

public class Evilnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isEvilnumber(i))
                System.out.println(i);
        }
    }

    static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 1)
                count++;
            n /= 10;
        }
        if (count == 0)
            count = 1;
        return count;
    }

    static boolean isEvilnumber(int i) {
        return (countOnes(i) % 2) == 0;
    }
}
