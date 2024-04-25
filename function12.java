package functions;

public class function12 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,};
        int value = 5;
        String c = find (a,value);
        System.out.println(c);
    }public static String find (int a[],int value){
        String d="yes , value Present in a[]";
        String e="No,  this value doesn't exists";
        String c="";
        for (int i=0;i<a.length;i++){
            if(a[i]==value){
                c=d;
                break;
            }else{
                c=e;
            }
        }return c;
    }
}
