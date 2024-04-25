package functions;
import java.util.Scanner;
public class function4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Add (a, b);
    }public static void Add(int a , int b){
        int c = a*b;
            System.out.println(c);
    }        
}
