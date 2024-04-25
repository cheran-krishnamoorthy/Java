import java.util.Scanner;
class if3{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        if (a>18){
            System.out.println("He is Eligible for VOTE");
        }else {    
            System.out.println("He is Not Eligible For VOTE");
        }    
    }
}