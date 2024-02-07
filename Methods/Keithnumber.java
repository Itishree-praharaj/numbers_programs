import java.util.Scanner;

public class Keithnumber {
    static int len(int a){
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        return count;
    }

    static boolean isKeithnumber(int a){
        int sum=0;
        int div=1;
        for(int i=1;i<=len(a);i++){
            div*=10;
        }
        int firstnum=a%div;
        int secondnum=a%(div/10);
        while(sum<=a){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
    }
}
