
package exceptionhandling;
import java.util.*;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a[]={5,6,7,8,9};
        System.out.println("enter array index");
       int i=ob.nextInt();
        try{
            System.out.println("value at index"+i+"is"+a[i]);
           
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
