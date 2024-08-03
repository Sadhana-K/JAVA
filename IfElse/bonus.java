import java.util.Scanner;
public class bonus{
    public static void main(String []args){
        Scanner Input=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary=Input.nextInt();
        System.out.println("Enter years of working: ");
        int year=Input.nextInt();
        if(year>=5){
            int Bonus=salary*5/100;
            System.out.print(Bonus);
        }
        else 
        {
            System.out.println("No bonus");
        }

    }
}