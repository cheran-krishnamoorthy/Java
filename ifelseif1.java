import java.util.Scanner;
class ifelseif1{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a>=50){
            System.out.println("Senior Citizen");
        }else if (a>=20){
            System.out.println("Major");
        }else{
            System.out.println("Minor");
        }
    }
}