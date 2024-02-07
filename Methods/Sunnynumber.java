import java.util.Scanner;

public class Sunnynumber {
    static double sqrroot(int a){
        double root =Math.sqrt(a);
        return root;
    }

    boolean isSunnynumber(int a){
        double num=Math.floor(sqrroot(a));
        
        return num==sqrroot(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        Sunnynumber sn= new Sunnynumber();
        for (int i = a; i <=b; i++) {
            int num=i+1;
            if(sn.isSunnynumber(num))System.out.println(i);
        }
    }
}
