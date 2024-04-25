import java.util.Scanner;

import org.w3c.dom.events.Event;
public class ternary2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        String b= (a%2==0)?"even":"odd";
            System.out.println(b);
    }
}
