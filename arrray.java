package Array;
public class arrray {
    public static void main(String[] args) {
        int a[]={2,31,412,5341,85739,57529,28374};
        int i = 0;
        int b = 0;
        while (i<a.length){
            if(a[i]%2==0){
                b+=a[i];
            }
            i++;
        }
        System.out.println(b);
    }
}