package Array;
import java.util.Scanner;
public class arrayscan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        for (int k=0;k<=i;k++){
            for (int l=0;l<=j;l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // System.out.println();
    }    
}
