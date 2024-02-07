public class Test1 {
    static public void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(add(1, 4, 7));
        System.out.println(t1.add(28, 29));
        System.out.println(add(20,10));
    }

    static double add(double a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a+b+c ;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(int a, double b) {
        return a + b;
    }
}
