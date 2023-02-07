package entities;

public class Recursive {

    public static int contador(int n1){
       if(n1==0){
           return 0;
       }
       return n1+contador(n1-1);

    }

}
