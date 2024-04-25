import java.util.Scanner;
class gamexo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        char d='O';
        System.out.println("Enter value:");
        char a[]={'-','-','-','-','-','-','-','-','-'};
       for(int j=0;j<9;j++){
        int b=scan.nextInt();
            if(!Move(a,b,d)){
                j--;
                continue;
            }
            Display(a);
            if(Winner(a, b, d)){
                System.out.println("            The Winner is:"+d);
             break;
            }
            d=player(d);
        }
        
    }
    public static void Display(char a[]){
       int c=0;
        for(int i=0;i<a.length;i++){
            if(c%3==0&&c!=0){
               System.out.println();
            }
            System.out.print(a[i]);
            c++;
        }
    }
    public static char player(char d){             
        if(d=='X'){
            return 'O';
        }
        else{
            return'X';
        }
    }
    public static Boolean Winner(char a[],int b,char d){
        if(a[0]==d&&a[1]==d&&a[2]==d||a[3]==d&&a[4]==d&&a[5]==d||a[6]==d&&a[7]==d&&a[8]==d){
            return true;
        }
        if(a[0]==d&&a[3]==d&&a[6]==d||a[1]==d&&a[4]==d&&a[7]==d||a[2]==d&&a[5]==d&&a[8]==d){
            return true;
        }
        if(a[0]==d&&a[4]==d&&a[8]==d||a[2]==d&&a[4]==d&&a[6]==d){
          return true;
        }
        else{
            return false;
        }
    }
    public static Boolean Move(char a[],int b,char d){
        if(a[b-1]=='-'){
            a[b-1]=d;
            return true;
            
        }
        else{
            System.out.println("Wrong Move");
            return false;
        }
    }
}