package functions;

public class function9 {
    public static void main(String[] args) {
        int a[]={11,2,13,4,15,6,17,18,9,7};
        int k=23;
        Add (a,k);
    }public static void Add(int a[],int k){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if(a[i]+a[j]==k){
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
