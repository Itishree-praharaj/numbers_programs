import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        String s= a+"";
        if(bn(s))System.out.println(s);
    }

    static boolean increasing(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1))count++;
        }
        return count>0;
    }

    static boolean decreasing(String s){
        int count=0;
        for (int i = 0; i <s.length()-1; i++) {
            if(s.charAt(i)<s.charAt(i+1))count ++;
        }
        return count>0;
    }

    static boolean bn(String s){
        return decreasing(s)&&increasing(s);
    }
}
