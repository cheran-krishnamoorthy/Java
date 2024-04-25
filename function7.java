package functions;

public class function7 {
    public static void main (String[] args){
        int a[]={21,22,23,24,25,26,27,28,29,30};
        Add (a);
    }public static void Add (int a[]){
        int c=0;
        for (int i=0;i<10;i++){
            if (a[i]%2==0){
                c+=a[i];
                
            }
        }System.out.println(c);
    }
}
