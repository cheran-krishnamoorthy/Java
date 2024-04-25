import java.util.Scanner;
class switchbio{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        String a = s.nextLine();
        switch(a){
            case "Cheran" : 
            System.out.println("Full Name : Cheran Krishna Moorthy");
            System.out.println("Mail      : cherankrishnamoorthy@gmail.com");
            System.out.println("Ph No     : 987654321");
            break;
            case "Ragu" : 
            System.out.println("Full Name : Name : Ragavendran ");
            System.out.println("Mail      : abc@gmail.com");
            System.out.println("Ph No     : 9876645381");
            break;
            case "Ajay" : 
            System.out.println("Full Name : Ajay Kumar");
            System.out.println("Mail      : xyz@gmail.com");
            System.out.println("Ph No     : 9765365836");
            break;
            default : System.out.println("No Data in the Given Details");
        }
    }
}