
package stringhandling;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
         System.out.println("enter a word/string");
         String s=ob.next();
         String s1=ob.next();
         String s2=ob.next();
         int l= s.length();
         int l1=s1.length();
         int l2=s2.length();
         if(l>l1&&l>l2){
             System.out.println("longest is"+s);
         }
             else if(l1>l2)
                     {
                     System.out.println("longest is"+s1);
                     
                     }
                     else{
                     System.out.println("longest is"+s2);
                     }
         
      
        
    }
    }
    

