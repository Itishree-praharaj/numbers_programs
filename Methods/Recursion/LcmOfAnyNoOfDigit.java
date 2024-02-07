import java.util.Scanner;

public class LcmOfAnyNoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(highest(1,2,5,6,9,10,15,78,91));
    }

    static int highest(int ...a){
        int high=0;
        for (int i : a) {
            if(i>high){
                high=i;
            }
        }
        return lcm(high, a);
    }

    static int lcm(int j,int ...a){
        for (int i : a) {
            if(j%i!=0){
                return lcm(++j, a);
            }
        }
        return j;
    }
}
