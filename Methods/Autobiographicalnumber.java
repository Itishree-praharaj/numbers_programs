import java.util.Scanner;

public class Autobiographicalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = sc.nextInt();
        int b= sc.nextInt();
        for (int i = a; i <=b; i++) {
            if(isAutobionum(i))System.out.println(i);
        }
    }

    static int noOfDigits(int i){
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;
    }

    static int sumOfDigits(int i){
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }

    static boolean isAutobionum(int i){
        return sumOfDigits(i)==noOfDigits(i);
    }
}
