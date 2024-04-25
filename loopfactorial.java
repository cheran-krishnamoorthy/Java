package whileloop;
class loopfactorial {
    public static void main (String [] args){
        int a = 10;
        int i = 1;
        int c = 1;
        while (i<=a){
            c*=i;
            i++;
        }
        System.out.println(c);
    }    
}