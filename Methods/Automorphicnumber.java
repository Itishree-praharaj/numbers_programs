import java.util.Scanner;

public class Automorphicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            if(isAutomorphicnumber(i))System.out.println(i);
        }
    }

    static int square(int a){
        int sqr=a*a;
        return sqr;
    }

    static int count(int a){
        int len=1;
        while(a>0){
            len*=10;
            a/=10;
        }
        return len;
    }

    static int lastdigits(int a){
        return square(a)%count(a);
    }

    static boolean isAutomorphicnumber(int a){
        return (lastdigits(a)==a);
    }
}
