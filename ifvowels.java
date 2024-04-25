import java.util.Scanner;
class ifvowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if ((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')){
            System.out.println("VOWEL");
        }else{
            System.out.println("This isn't a VOWEL");
        }
    }
}
