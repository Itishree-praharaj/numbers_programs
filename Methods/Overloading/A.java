public class A {
    public static void main(String[] args) {
        m1();
        m1(45);
        m1("Rakesh");
    }
    static void m1(){
        System.out.println("hi");
    }

    static void m1(int i){
        System.out.println("hi"+i);
    }

    static void m1(String s){
        System.out.println("hi "+s);
    }
}
