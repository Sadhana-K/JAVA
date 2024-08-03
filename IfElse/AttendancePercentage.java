import java.util.Scanner;
public class AttendancePercentage{
    public static void main(String[]args){
        Scanner Input=new Scanner(System.in);
        System.out.print("enter no.of classes: ");
        int classes=Input.nextInt();
        System.out.print("enter no.of classes attended: ");
        int attend=Input.nextInt();
        int percentage= (attend*100)/classes;
        if(percentage<75)
        {
            System.out.println("not allowed");
        }
        else{
            System.out.println("allowed");
        }
    }
}