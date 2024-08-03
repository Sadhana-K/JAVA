import java.util.Scanner;
public class Week{
    public static void main(String []args){
        Scanner Input=new Scanner(System.in);
        System.out.println(" Enter letter from a to z: ");
        int letter=Input.next().charAt(0);
        switch(letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowels");
            break;
            default:
            System.out.println("Consonants");
        }
    }
}