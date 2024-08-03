import java.util.Scanner;
public class Sum{
    static int TotalSum (int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        return sum;
    }
    
    public static void main(String []args){
        System.out.println("Enter no.: ");
        Scanner In=new Scanner(System.in);
        int n=In.nextInt();
        System.out.println(TotalSum(n));
        //System.out.println(TotalSum(000));
        //System.out.println(TotalSum(6688));
        //System.out.println(TotalSum(2234));

    }
}