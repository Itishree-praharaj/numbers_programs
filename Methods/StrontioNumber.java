import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();
        if(str(a))System.out.println("It is a strontio num ");
        else System.out.println("It is not a strontio number ");
    }

    static int count(int i){
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;
    }

    static boolean str(int i){
        int num=i*2;
        if(count(num)<3)return false;
        num/=10;
        int sec=num%10;
        num/=10;
        int third = num%10;
        return sec==third;
    }

}
