package Overloading;

public class Test2 {
    void m1(int i) {

    }

    boolean m1() {
        return true;
    }
    // this will throw error because we cannot overload a method by changing the
    // return type
}
