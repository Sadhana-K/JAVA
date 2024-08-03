import java.util.Scanner;
public class FindCase{
    public static void main(String [] args){
        Scanner Input=new Scanner(System.in);
        System.out.print("enter any alphabets: ");
        char c=Input.next().charAt(0);
        if (c>=97 && c<=122)
        {
            System.out.println("lowercase");
        }
        else if(c>=65 && c<=90)
        {
            System.out.println("Uppercase");
        }
    }
}