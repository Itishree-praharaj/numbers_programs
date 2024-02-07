public class Rhombus {
    public static void main(String[] args) {
        rhombus(5);
    }

    static void rhombus(int r){
        for (int i = 1; i <=r; i++) {
            for(int j=i;j<r;j++){
                System.out.print(" ");
            }
            for(int j=1;j<r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
