package whileloop;
class loop2 {
    public static void main (String [] args){
        int a = 10;
        int i = 1;
        int j = 1;
        int k= 1;
        while (i<=a){       
            if (i%2==0){
                j*=i;
            }else{
                k*=i;   
            }
            i++;
        }
        System.out.println(j);
        System.out.println(k);
    }    
}