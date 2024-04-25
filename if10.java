import java.util.Scanner;
class if10 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if ((a>='0')&&(a<='9')){
            System.out.println("It's A Number");
        }else {
            System.out.println("it's A Alphabet");
        }
    }
}