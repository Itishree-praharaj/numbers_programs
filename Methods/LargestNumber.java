import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt(); 
        int b=sc.nextInt(); 
        int c=sc.nextInt(); 
        System.out.println("The largest number among the entered number is "+largest(a, b, c));
    }

    static int largest(int n,int m,int i){
        if(n>=m){
            if(n>=i)return n;
            else return i;
        }
        else if(m>=i){
            if(m>=n)return m;
            else return n;
        }
        else if(i>=n){
            if(i>=m)return i;
            else return m;
        }

        return 0;
    }
}
