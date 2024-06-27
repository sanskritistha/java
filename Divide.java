
package exceptionhandling;
import java.util.*;
public class Divide {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter two number");
        int a=ob.nextInt();
        int b=ob.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
       }
      catch(ArithmeticException e){
          System.out.println(e);
       } 
        
      
    }
    
}
