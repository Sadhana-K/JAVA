import java.util.Scanner;
class Box{
    int length;
    int height;
    int breadth;
    int volume(){
        return length*height*breadth;
    }
    int SurfaceArea(){
        if(breadth==height){
            return breadth*height;
        }
        else{
            return (breadth*height)/2;
        }
    }
}

public class ClassDemo{
    public static void main(String []args){
        Scanner Input=new Scanner(System.in);
        System.out.println("enter length: ");
        int a=Input.nextInt();
        System.out.println("enter breadth: ");
        int b=Input.nextInt();
        System.out.println("enter height: ");
        int c=Input.nextInt();
        Box woodbox=new Box();
        woodbox.length=a;
        woodbox.breadth=b;
        woodbox.height=c;
        System.out.println("box volume is " + woodbox.volume());
        System.out.println("box surfacearea is " + woodbox.SurfaceArea());

    }
}