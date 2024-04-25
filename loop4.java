package whileloop;
import java.util.Scanner;
class loop4{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt ();
        int b = s.nextInt();
        int i =10;
        while (i>=b){
            System.out.println(a+"*"+i+" ="+a*i);
            i--;
        }
    }
}