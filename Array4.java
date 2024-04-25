package Array;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a[]=new int[5];
        a[0]=s.nextInt();
        a[1]=s.nextInt();
        a[2]=s.nextInt();
        a[3]=s.nextInt();
        a[4]=s.nextInt();
        System.out.println();
        System.out.println(a[4]);
        System.out.println(a[3]);
        System.out.println(a[2]);
        System.out.println(a[1]);
        System.out.println(a[0]);
    }
}
