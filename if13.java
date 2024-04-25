import java.util.Scanner;
class if13{
    public static void  main (String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a<b)&&(a<c)){
            System.out.println(a+" is Smaller Than All");
        }else if ((b<a)&&(b<c)){
            System.out.println(b+" is Smaller Than All");
        }else if ((c<a)&&(c<=b)){
            System.out.println(c+" is Smaller Than All");
        }
    }
}