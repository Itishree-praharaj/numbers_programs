import java.util.Scanner;

public class NumberIsOddOrEvenWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        if((num&1)==1)System.out.println("It is an odd number ");
        else System.out.println("It is an even number");
    }
}
