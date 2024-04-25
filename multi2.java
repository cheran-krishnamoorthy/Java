package Array;
public class multi2 {
    public static void main(String[] args) {
        int a[][]={{1,2,3,},{4,5,6},{7,8,9}};
        for(int i=2;i>=0;i--){
            for(int j=2;j>=0;j--){
                System.out.print(a[i][j]);
                // System.out.print(a[1][j]);
                // System.out.print(a[2][j]);
            }System.out.println();
        }
    }
}