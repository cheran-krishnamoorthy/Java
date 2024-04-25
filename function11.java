package functions;

public class function11 {
    public static void main(String[] args) {
        int a=10;
        int c=1;
        int d =Add(a,c);
        System.out.println(d);
    }public static int Add (int a,int c){
        for (int b=1;b<=a;b++){
            c*=b;
        }
        return c;
    }
}