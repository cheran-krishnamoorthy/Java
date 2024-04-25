package basic;
import java.util.Scanner;
class scan{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        byte b = s.nextByte();
        float c = s.nextFloat();
        String d = s.nextLine();
        // long e = s.nextLong();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // System.out.println(e);
    } 
}