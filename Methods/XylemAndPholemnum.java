import java.util.Scanner;

public class XylemAndPholemnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        if(xylemorpholem(n))System.out.println("it is a xylem number");
        else System.out.println("It is a pholem number");
    }

    static int count(int i){
        int div=1;
        while(i>9){
            div*=10;
            i/=10;
        }
        return div;
    }
    
    static int len(int i){
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;
    }
    static boolean xylemorpholem(int i){
        if(count(i)<=2)return false;
        int firstnum = i/count(i);
        i%=count(i);
        int secondnum=i%10;
        i/=10;
        int internalsum=0;
        while(i>0){
            internalsum+=i%10;
            i/=10;
        }
        int externalsum=firstnum+secondnum;
        return externalsum==internalsum;
    }
}
