package whileloop;
class loop3{
    public static void main (String [] args){
        int a = 0;
        int i = 10;
        int j=0;
        while (a<=i){
            j+=a;
            a++;
        }
        System.out.println(j);
    }
}