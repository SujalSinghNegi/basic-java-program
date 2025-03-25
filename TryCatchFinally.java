import java.util.*;
public class TryCatchFinally{
    public static void main(String[] args) {
        int a =1;
        int b =0;
        try{
            int d = a/b;
            System.out.println("Division is "+d);
        }catch(ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
        }
        finally{
            System.out.println("Finally block is always executed");
        }

      
    }

}
