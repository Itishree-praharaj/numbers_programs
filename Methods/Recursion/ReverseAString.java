import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s= sc.next();
        int len=s.length();
        System.out.println(rev(s, len));
    }

    static String rev(String s,int len){
        if(len<=0)return "";
        return s.charAt(len-1)+rev(s,--len);
    }
}
