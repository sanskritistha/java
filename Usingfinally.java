
package exceptionhandling;


public class Usingfinally {
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
    finally{
    System.out.println("Welcome");
}
    }
}
