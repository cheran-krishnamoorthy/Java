package whileloop;
class loop5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 1;
        int i = 0;
        int j = 0;
        while (i<=b){
            c=a*i;
            i++;
            j+=c;
        }
        System.out.println(j);
    }   
}
