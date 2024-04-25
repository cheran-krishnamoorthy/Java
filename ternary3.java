import java.util.Scanner;

public class ternary3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = (a>=18)?"Major":"Minor";
            System.out.println(b);
    }
}