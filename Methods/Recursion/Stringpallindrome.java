import java.util.Scanner;

public class Stringpallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.next();
        if (s.equals(rev(s, s.length())))
            System.out.println("the String is a pallindrome");
        else
            System.out.println("String is not a pallindrome");
    }

    static String rev(String s, int len) {
        if (len <= 0)
            return "";
        return s.charAt(len - 1) + rev(s, len - 1);
    }
}
