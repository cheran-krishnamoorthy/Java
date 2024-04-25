package functions;
import java.util.Scanner;
public class function3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Devide (a, b);
    }public static void Devide(int a , int b){
        int c = a/b;
            System.out.println(c);
    }        
}
