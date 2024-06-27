
package exceptionhandling;

import java.util.*;

public class Nestedtry {
   public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        int b[]={5,6,7,8,9,10};
        try{
             int c=10/n;
            System.out.println(c);
            try{
                int a=10/(n-2);
            System.out.println(a);
            System.out.println("value at index"+n+"is"+b[n]);
                    
                
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Invaild Array Index");
            }
        }
        catch( ArithmeticException ex){
                    System.out.println("divide by zero");
                }  
}
}
