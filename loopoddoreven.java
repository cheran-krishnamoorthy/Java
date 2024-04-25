package whileloop;
class loopoddoreven {
    public static void main (String [] args){
        int a = 10;
        int i = 0;
        int j = 0;
        int k= 0;
        while (i<=a){       
            if (i%2==0){
                j+=i;
            }else{
                k+=i;   
            }
            i++;
        }
        System.out.println(j);
        System.out.println(k);
    }    
}