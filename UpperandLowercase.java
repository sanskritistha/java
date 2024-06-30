
package stringhandling;

import java.util.Scanner;

public class UpperandLowercase {
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
         System.out.println("enter a word/string");
         String s=ob.next();
         String s1=s.toUpperCase();
         System.out.println(s1);
         String s2=s.toLowerCase();
         System.out.println(s2);
         int len=s.length();
         System.out.println("no.of characters="+len);
    }
    
}
