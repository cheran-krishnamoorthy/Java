import java.util.Scanner;
class if4{
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        char a = s.next().charAt(0);
        char b = s.next().charAt(0);
        if(a=='H'){
            System.out.println("HELLO");
        }else {
            System.out.println("ERROR");
        } 
        if(b=='Y'){
            System.out.println("HELLO");
        }else {
            System.out.println("ERROR");
        }
        
    }
}