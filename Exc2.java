//program with exception handling
package exceptionhandling;
public class Exc2 {
    public static void main(String[] args) { 
    int a=5,b=10;
    try{
    int c=b/(a-5);
        System.out.println(c);
}
  catch(ArithmeticException e)
  {
    System.out.println(e);
}  
    System.out.println("Welcome");
}
}
