public class C {
    public static void main(String[] args) {
        m1(1,1);
    }

    static void m1(int a,byte b){
        System.out.println(a+"+"+b);
    }
    static void m1(byte a,int i){
        System.out.println("s"+a+""+i);
    }
}
