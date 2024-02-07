import java.util.Scanner;

public class Spynumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b= sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isSpynumber(i))System.out.println(i);
        }
    }

    static int sum(int i){
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }

    static int mult(int i){
        int mult=1;
        while(i>0){
            mult*=i%10;
            i/=10;
        }
        return mult;
    }

    static boolean isSpynumber(int i){
        return sum(i)==mult(i);
    }
}
