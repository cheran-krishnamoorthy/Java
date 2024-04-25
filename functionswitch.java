package functions;
import java.util.Scanner;
public class functionswitch {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        switch (c) {
            case 1 : Add (a,b);
            break;
            case 2 : Sub (a,b);
            break;
            case 3 : Divide (a,b);
            break;
            case 4 : Multiply (a,b);
            break;     
            default: System.out.println("No Calculations");
                break;
        }
    }public static void Add(int a ,int b){
        int d = a+b;
            System.out.println(d);
    }public static void Sub(int a ,int b) {
        int e = a-b;
            System.out.println(e);
    }public static void Divide(int a , int b) {
        int f = a/b;
            System.out.println(f);
    }public static void Multiply(int a , int b) {
        int g = a*b;
            System.out.println(g);
    }
}
