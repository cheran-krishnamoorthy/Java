import java.util.Scanner;
class switch4{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        char d = s.next().charAt(0);
        switch(d){
            case '+' :
            c = a+b ;
            System.out.println(c);
            break;
            case '-' :
            c = a-b ;
            System.out.println(c);
            break;
            case '*' :
            c = a*b ;
            System.out.println(c);
            break;
            case '/':
            c = a/b ;
            System.out.println(c);
            break;
            default : System.out.println("It is not a calculator Opretor");
            break;
        }
    }
}