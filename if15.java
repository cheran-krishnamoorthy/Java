import java.util.Scanner;
class if15{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        if (((a%2==0)||(a%3==0))){
            System.out.println(a);
        }else {
            System.out.println("no");
        }
    }
}