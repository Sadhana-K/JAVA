import java.util.Scanner;
public class BigAge{
    public static void main(String []args){
        Scanner Input =new Scanner(System.in);
        System.out.print("enter a age");
        int a=Input.nextInt();
        System.out.print("enter b age");
        int b=Input.nextInt();
        System.out.print("enter c age");
        int c=Input.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is oldest man");
            } 
        }
        if(b>c)
        {
            if(b>a)
            {
                System.out.println("b is graeter");
            }
        }
        if(c>a)
        {
            if(c>b)
            {
                System.out.println("c is oldest");
            }
        }
        else
        {
            System.out.println("nope");
        }
        

    }
}