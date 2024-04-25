import java.util.Scanner;
class nestedif2{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int b = s.nextInt();
        if (a=='M'){
            if (b>=18){
                System.out.println("Male He is Eligible for our College");
            }else {
                System.out.println("Male But He is not Eligible for our College");
            }
        }else {
            System.out.println("sorry it's a Boys Collage");
        }
    }
}