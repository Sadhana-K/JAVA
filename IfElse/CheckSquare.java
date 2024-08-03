import java.util.Scanner;
public class CheckSquare{
    public static void main(String [] args){
        Scanner measure= new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length=measure.nextInt();
        System.out.print("Enter the breath: ");
        int breath=measure.nextInt();
        if(length==breath)
            System.out.println("Square");
        else
            System.out.println("not a square");
    }
}