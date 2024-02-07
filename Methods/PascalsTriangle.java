public class PascalsTriangle {
    public static void main(String[] args) {
        pascal(7);
    }

    static void pascal(int i){
        for(int j=1;j<=i;j++){
            for(int k=1;k<=i;k++){
                if(k==1||j==k){
                    System.out.print(1+" ");
                }
                else if((k==2&&j>1)){
                    System.out.print(j-1+" ");
                }
                else if(j==k){
                    System.out.print(k+" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
