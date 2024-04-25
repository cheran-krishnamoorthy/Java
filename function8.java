package functions;

public class function8 {
    public static void main(String[] args) {
        int a[]={21,22,23,24,25,26,27,28,29,30};
        int k=25;
        Add (a,k);
    }public static void Add (int a[] ,int k){
        for (int i=0;i<10;i++){
            if(k==a[i]){
                System.out.println(i);
            }
        }
    }
}