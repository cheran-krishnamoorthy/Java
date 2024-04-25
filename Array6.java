package Array;
public class Array6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        while (i<a.length){
            if (a[i]%2==0){
                if (a[i]%4==0){
                    System.out.println(a[i]);
                }else{
                    System.out.println(a[i]+" Even , but Not Able to / with 4");
                }
            }else {
                System.out.println("Odd");
            }i++;
        }
    }
}
