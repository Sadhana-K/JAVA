import java.util.Scanner;
public class StudentData {
    int rollno;
    String name;
    int mark[];
    int sum=0;
    
    class StudentData(int r, String n, ){
        int rollno=r;
    }

    public void TotalMark(){
       Scanner Input=new Scanner(System.in);
       int[] arr=new int[3];
       System.out.println("enter 3 subject marks: ");
       
       for(int i=0;i<=2;i++){
        arr[i]=Input.nextInt();
       }
       for(int i=0;i<=2;i++){
        sum=sum+arr[i];
       }
    }
    
    public void Display(){
         System.out.println("Rollno" + rollno);
         System.out.println("Name: " + name);
         System.out.println("Total mark is" + sum);
    }

    public static void main(String[]args){
        StudentData Stu1=new StudentData();
        Stu1.setData(); 
        Stu1.TotalMark();
        Stu1.Display();
    }
}
