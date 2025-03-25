public class ThrowException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
       // use throw exception to explictly throw an exception
       try{
           if(b==0){
               throw new ArithmeticException("Division by 0 is not allowed");
            }
            int d = a/b;
           System.out.println("Division is "+d);
         }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        
        }
        
    }
    
}
