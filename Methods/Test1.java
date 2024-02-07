public class Test1 {
    public static void main(String[] args) {
        m1(1,2,4,57,2,3,5,6);
    }
    static void m1(int...a){
        for (int i : a) {
            System.out.println(i);
        }
    }
}
