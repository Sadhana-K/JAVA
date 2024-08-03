public class Fibbanoci{
    static int n1=0,n2=1,n3=0;
    static void fact(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            fact(n-1);
        }
        
    }


    public static void main(String[] args) {
        int n=5;
        System.out.print(n1 + " " + n2);
        fact(n);
    }
}