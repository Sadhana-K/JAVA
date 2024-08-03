import java.util.Scanner;
class Student{
    String name;
    int roll;
    int mark[];
    public void setData(){
        Scanner Input = new Scanner(System.in);

        System.out.println("enter name: ");
        name=Input.nextLine();
        System.out.println(name);

        System.out.println("enter rollno: ");
        roll=Input.nextInt();
        System.out.println(roll);
       
    }
    public void markTotal(){ //method definition
        int sum=0;      
        for(int i=0;i<=2;i++){
            sum=sum+mark[i];
        }
        System.out.println(sum);
    }
    public static void main(String[]args){
        Student Stu1=new Student();
        Stu1.mark[0]=10;
        Stu1.mark[1]=15;
        Stu1.mark[2]=20;
        Stu1.setData();
        Stu1.markTotal();
    }    
}
