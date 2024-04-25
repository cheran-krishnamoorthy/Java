import java.util.Scanner;
class if11{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        char b = s.next().charAt(0);
        char c = s.next().charAt(0);
        if ((a>=b)&&(a>=c)){
            System.out.println(a+"  is Bigger Than All");
        }else if ((b>=a)&&(b>=c)){
            System.out.println(b+"  is Bigger Than All");
        }else if ((c>=a)&&(c>=b)){
            System.out.println(c+"  is Bigger than All");
        }         
    }
}
