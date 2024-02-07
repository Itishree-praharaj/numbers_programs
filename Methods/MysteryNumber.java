import java.util.Scanner;

public class MysteryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        mystery(a);
    }

    static int rev(int i){
        int reverse=0;
       while(i>0){
        reverse=(reverse*10)+i%10;
        i/=10;
       }
       return reverse;
    }

    static void mystery(int i){
        for(int j=1;j<=i/2;j++){
            int k=rev(j);
            if(j+k==i){
                System.out.println(j+"and"+k); 
                System.out.println(i+" is a mystery number");
                return;
            }
        }
    }
}
