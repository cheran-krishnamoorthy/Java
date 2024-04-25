import java.util.Scanner;
class if7{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%2==1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}