
package exceptionhandling;

import java.util.Scanner;


public class MultipleCatch {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter anumber");
        int n=ob.nextInt();
       
        int b[]={5,6,7,8,9,10};
        try{
            int a=10/(n-2);
      
          
            System.out.println(a);
           System.out.println("value at index"+n+"is"+b[n]);
                    
        }
                catch( ArithmeticException e){
                    System.out.println(e);
                }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    }
    
