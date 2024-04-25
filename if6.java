import java.util.Scanner;
class if6{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a>=18){
            System.out.println("He is A Major");
        }else{
            System.out.println("He is A Minor");
        }
    }
}