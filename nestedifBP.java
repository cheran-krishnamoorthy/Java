import java.util.Scanner;
class nestedifBP{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if ((a>=40)&&(a<=60)){
            if ((b>=70)&&(b<=90)){
                System.out.println("BP level is Low");
            }else {
                System.out.println("BP is Unstable");
            }
        }else if ((a>=60)&&(a<=90)){
            if ((b>=90)&&(b<=120)){
                System.out.println("BP level is Normal");
            }else {
                System.out.println("BP is Unstable");
            }    
        }else if ((a>=80)&&(a<=90)){
            if ((b>=120)&&(b<=140)) {
                System.out.println("BP level is Pre Hper");
            }else{
                System.out.println("BP level is Unstable");
            }
        }else if ((a>=90)&&(a<=100)) {
            if ((b>=140)&&(b<=160)) {
                System.out.println("BP level is High Hyper");
            }else{
                System.out.println("BP level is Unstable");
            }
        }else {
            System.out.println("BP level is Unstable");
        }
    }
}