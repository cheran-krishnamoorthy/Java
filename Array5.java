package Array;

public class Array5{
    public static void main(String[] args){
        int a[]={11,22,33,44,55,66,77,88,99,110};
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length){
            if(a[i]%2==0){
                j+=a[i];
            }else{
                k+=a[i];
            }
        i++;
        }
    System.out.println(j);
    System.out.println(k);
    }
}
