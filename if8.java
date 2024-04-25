import java.util.Scanner;
class if8{
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        if(a%4==0){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}