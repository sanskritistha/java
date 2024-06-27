//creating our own exception class
package exceptionhandling;

import java.util.*;
class MyException extends  Exception{
    MyException(String msg)
    {
        super(msg);
    }
           
}
public class Exc3 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter two number");
        double a=ob.nextDouble();
        double b=ob.nextDouble();
        double c=a/b;
       if(c>0.0001){
            try{
            MyException me =new  MyException("Result is very small"); 
          throw me;
        }
            catch( MyException ex){
 System.out.println(ex);
            }
                
            }
        else{
            System.out.println("Result="+c);
        }
    }   
}
