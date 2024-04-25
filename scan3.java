package basic;
import java.util.Scanner;
class scan3{
    public static void main (String [] args){
        Scanner s =new Scanner(System.in);
        int p = s.nextInt();
        int n = s.nextInt();
        int r = s.nextInt();
        int x = p*n*r/100;
        System.out.println(x);
    }
}