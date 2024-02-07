import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year=sc.nextInt();
        ly(year);
    }
    static void ly(int a){
       if(a%400==0||(a%100!=0&&a%4==0)){
        System.out.println("It is a leap year");
       }
       else System.out.println("It is not a leap year");
     }
}
