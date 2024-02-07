public class B {
    public static void main(String[] args) {
        m1('r');
        m1("hi");
    }
    static void m1(char a){
        System.out.println("hi chr"+a);
    }
    static void m1(String s){
        System.out.println("hi_st"+s);
    }
}
