import java.util.Scanner;
class ifelseif2{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a>=90){
            System.out.println("A");
        }else if (a>=50){
            System.out.println("B");
        }else if (a>=35){
            System.out.println("C");
        }else {
            System.out.println("FAIL");
        }
    }
}