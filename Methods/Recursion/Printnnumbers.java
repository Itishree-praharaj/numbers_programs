
import java.util.Scanner;

public class Printnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        printnum(a, b);
    }

    static int printnum(int i,int e){
        if(i>e)return 0;
        System.out.println(i);
        return printnum(++i, e);
    }
}
