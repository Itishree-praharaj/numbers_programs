import java.util.Scanner;

public class Fascinatingnumber {
    static boolean isFascinatingnumber(int a) {
        int num1 = a * 2;
        int num2 = a * 3;

        String s = "" + num1 + num2 + a;
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            int frequency=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) - '0' == i) {
                    frequency++;
                }
            }
            if(frequency>1||frequency==0)return false;
            else
            count++;
        }
        return count >= 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isFascinatingnumber(i))
                System.out.println(i);
        }
    }
}