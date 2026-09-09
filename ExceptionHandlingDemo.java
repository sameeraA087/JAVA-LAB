public class ExceptionHandlingDemo {
 public static void main(String[]args){
    int a=10;
    int b=10;
    try{
        int result=a/b;
        System.out.println("Result="+result);
    }
    catch(ArithmeticException e){
        System.out.println("Exception caught:Cannot divide by zero");
    }
    finally{
        System.out.println("Finally block executed");
    }
 }
}
