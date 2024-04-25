import java.util.Scanner;
class iflogical1{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt ();
        if ((a>=50)&&(a<=70)){
            System.out.println(a);
        }else {
            System.out.println();
        }
    }
}