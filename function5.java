package functions;
import java.util.Scanner;
public class function5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a =s.nextInt();
        Add (a);
    }public static void Add (int a){ 
        int b = 0;
        for (int i=1;i<a;i++){
            b+=i; 
        }System.out.println(b);
    }    
}
