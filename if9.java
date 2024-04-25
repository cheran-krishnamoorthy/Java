import java.util.Scanner;
class if9{
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        if (a>=50){
            System.out.println("He is a SENIOR CITIZEN");
        }else{
            System.out.println("He is a MAJOR");
        }
    }
}