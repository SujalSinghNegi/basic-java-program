
class MyException{
   static void Throws() throws ArithmeticException{
        System.out.println("Method");
        throw new ArithmeticException("Arithmetic Exception");
    }
    public static void main(String[] args) {
        try {
            Throws();
        }
        catch(ArithmeticException e){
            System.out.println("Caught " + e.getMessage());
        }
            
    }

}

