package functions;
public class function10 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int sum = Add(num1,num2);
        // System.out.println(sum);
        int []num={11,12,13,14,15,16,17,18};
        //1,5,2,6,3,7,4,8
        suffele(num);
    }
    public static int Add(int a ,int b){
        return  a + b ;
    }
    public static void suffele(int []arr){
        int []num1={11,12,13,14,15,16,17,18};
        int num2[]=new int [8];
        for(int i=0;i<4;i++){
            num2[i]=num1[i]+num1[i+4];
        }System.out.println(num2.toString());
    }
}