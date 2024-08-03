public class Average {
    

    public int average (int a, int b){
            int avg= (a+b)/2;
            return avg;
    }
    public int average (int a, int b, int c){
            int avg= (a+b+c)/2;
            return avg;
    }
    
    public static void main(String []args){
        Average obj1=new Average();
        System.out.println(obj1.average(2,3));
        System.out.println(obj1.average(2,3,4));


    }
}
