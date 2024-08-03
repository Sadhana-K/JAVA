class box{
    
     int length;
    int breadth;
    int height;
    public box(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;
     }
     int volume(){
        return length*breadth*height;
     }
}

public class Box{
    public static void main(String[]args){
        box glassBox=new box(2,4,3);
        System.out.println(glassBox.volume());
    }

}
    