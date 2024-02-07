public class DiagonalAndSideOfRohmbus {
    public static void main(String[] args) {
        diagonalAndSide(9);
    }

    static void diagonalAndSide(int r){
        for(int i=1;i<=r;i++){
            for (int j = 1; j <=r; j++) {
                if(j==((r/2)+1)||i==(r/2)+1||i+j==((r/2)+2)&&i>1||(j-i==4)||i-j==4||j+i==14){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
