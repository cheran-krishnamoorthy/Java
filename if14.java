import java.util.Scanner;
class if14{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if ((a%4==0)&&(a%100!=0)){
            System.out.println(a+" is A Leap Year");
        }else {
            System.out.println(a+" is not a Leap Year");
        }
    }
}