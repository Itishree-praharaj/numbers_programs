import java.util.Scanner;

public class MaximumElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,8,4,6,7,2};
        System.out.println(max(arr, arr.length, 0));
    }

    static int max(int[]arr,int len,int maxi){
        if(len<=0)return maxi;
        if(maxi<arr[len-1]){
            maxi=arr[len-1];
            return max(arr,len-1,maxi);
        }
        else 
        return max(arr, len-1, maxi);

    }
}
