package ForLoop;
import java.util.Scanner;
public class Forloop3 {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        int i = s.nextInt();
        for(int j=0;j<=10;j++){
            System.out.println(i+" *"+j+" ="+i*j);
        }    
    }
}
