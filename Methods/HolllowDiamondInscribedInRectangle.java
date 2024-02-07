public class HolllowDiamondInscribedInRectangle {
    public static void main(String[] args) {
        hollowDiamondInRect(10);
    }

    static void hollowDiamondInRect(int r){
        for(int i=1;i<=r;i++){

            if(i<=r/2){
                for(int j=i;j<=r/2;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=i;j<=r/2;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=r-i;j<r/2;j++){
                    System.out.print("* ");
                }
                for(int j=i;j<r;j++){
                    System.out.print("  ");
                }
                for(int j=i;j<r;j++){
                    System.out.print("  ");
                }
                for(int j=r-i;j<r/2;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
