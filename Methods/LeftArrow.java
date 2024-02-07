public class LeftArrow {
    public static void main(String[] args) {
        leftArrow(9);
    }

    static void leftArrow(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == (r / 2) + 1 || i + j == ((r + 1) - (r / 2)) || i - j == (r / 2)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
