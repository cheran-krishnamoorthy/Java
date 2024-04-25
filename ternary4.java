import java.util.Scanner;

public class ternary4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        char a = s.next().charAt(0);
        char b = (a=='F')?'M':'F';
            System.out.println(b);
    }
}
