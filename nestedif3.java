import java.util.Scanner;
class nestedif3{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        char a = s.next().charAt(0);
        float b = s.nextFloat();
        float c = s.nextFloat();
        if (a=='M'){
            if ((b>=12)&&(b<=18)){
                if ((c>=13.0)&&(c<=16.0)){
                    System.out.println("Male , Hemoglobin Level is Normal");
                }else {
                    System.out.println("Male , Hemoglobin Level is Abnormal");
                }
            }else if (b>=18) {
                if ((c>=13.6)&&(c<=17.7)){
                    System.out.println("Male , Hemoglobin Level is Normal");
                }else{
                    System.out.println("Abnormal");
                }
            }else {
                System.out.println("Male , Hemoglbin level is Abnormal");
            }
        }else if (a=='F'){
            if ((b>=12)&&(b<=18)){
                if ((c>=12.0)&&(c<=16.0)){
                    System.out.println("Female , Hemoglobin Level is Normal");
                }else {
                    System.out.println("Female , Hemoglobin Level is Abnormal");
                }
            }else if (b>=18) {
                if ((c>=12.1)&&(c<=15.1)){
                    System.out.println("Female , Hemoglobin Level is Normal");
                }else{
                    System.out.println("Abnormal");
                }
            }else {
                System.out.println("Female , Hemoglbin level is Abnormal");
            }
        }else{
            if ((b>=0.5)&&(b<=2)){
                if ((c>=10.5)&&(c<=13.5)){
                    System.out.println("lobin Level is Normal");
                }else {
                    System.out.println("lobin Level is Abnormal");
                }
            }else if ((b>=2)&&(b<=6)) {
                if ((c>=11.5)&&(c<=13.5)){
                    System.out.println("Hemoglobin Level is Normal");
                }else{
                    System.out.println("Hemoglobin level is Abnormal");
                }
            }else if ((b>=6)&&(b<=12)){
                if ((c>=11.5)&&(c<=15.5)){
                    System.out.println("Hemoglobin level is Normal");
                }
            }else {
                System.out.println("Hemoglbin level is Abnormal");
            }
        }    
    }
}