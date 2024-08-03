import java.util.Scanner;
public class gradibgSystem{
    public static void main(String[]args){
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int mark=Input.nextInt();
        if(mark<25){
            System.out.println("Fail");
        }
        else if(mark<=45){
            System.out.println("E grade");
        }
        else if(mark<=50){
            System.out.println("D grade");
        }
        else if(mark<=60){
            System.out.println("C grade");
        }
        else if(mark<=80){
            System.out.println("B grade");
        }
        else if(mark>80){
            System.out.println("A grade");
        }

    }
}