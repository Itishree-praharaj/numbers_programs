import java.util.Scanner;

public class ISBNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ten digit number ");
        long i = sc.nextLong();
        if(isbn(i)>0)System.out.println(isbn(i));
    }

    static long count(long i){
        long len=0;
        while(i>0){
            len++;
            i/=10;
        }
        return len;
    }

    static long isbn(long i){
        long sum=0;
        long mul=1;
        if(count(i)!=10)return 0;
        while(i>0){
            sum+=mul*(i%10);
            i/=10;
            mul++;
        }
        return sum;
    }
}
