public class Add {
    public static void main(String[] args) {
        addition(10, 45.78);
        new Add().addition(45.21, 34, 45.98765);
    }

    static int addition(double a, double b) {
        System.out.println(b + "+" + a + "=" + (a + b));
        return (int) (b + a);
    }

    void addition(double a, double b,double c) {
        System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
    }
}
