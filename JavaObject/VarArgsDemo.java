public class VarArgsDemo {
    static int minValue(int... val){  // int... denotes the variable length arguments.
        int min=Integer.MAX_VALUE;    // inbuilt statement finds the largest no. in given i/p
        for(int k:val){      // for each loop
           if(k<min)
            min=k;
        }
        return min;
    }

    static char minValue(char... ch){
        char min=Character.MAX_VALUE;    // inbuilt statement finds the largest no. in given i/p
        for(char k:ch){      // for each loop
           if(k<min)
            min=k;
        }
        return min;
    }

    public static void main(String args[]){
        char m=minValue('o','z','n','s'); //VarArgs take this given i/p to array
        System.out.println("character min is" + m);

        char l=minValue('<','/','?'); //VarArgs take this given i/p to array
        System.out.println("character min is" + l);

        int n=minValue(3,6,5,7,8,87);
        System.out.println("integer min is" + n);
    }
}
