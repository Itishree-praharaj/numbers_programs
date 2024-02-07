import java.util.Scanner;

public class ArrayInWhichOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 7, 4, 5, 7, 8 };
        if (asc(arr, arr.length))
            System.out.println("The array is in Ascending order");
        else
            System.out.println("The array is not in Ascending order ");
    }

    static boolean asc(int[] arr, int len) {
        if (len <= 1)
            return true;
        System.out.println(1);
        if (arr[len - 1] > arr[len - 2]) {
            return true && asc(arr, len - 1);
        } else
            return false;
    }
}
