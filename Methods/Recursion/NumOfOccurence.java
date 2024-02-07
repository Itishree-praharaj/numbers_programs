import java.util.Scanner;

public class NumOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to search ");
        int num = sc.nextInt();
        System.out.println(ocurence(n, num));
    }

    static int ocurence(int i, int a) {
        if (i == 0)
            return 0;
        if (i % 10 == a)
            return 1 + ocurence(i / 10, a);
        else
            return 0 + ocurence(i / 10, a);
    }
}
