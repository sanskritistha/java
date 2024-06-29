 
package stringhandling;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String rev=" ";
         Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String s=ob.next();
        for(int i=s.length()-1;i>=0;i--){
            char n=s.charAt(i);
            rev=rev+n;
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev)) {
            System.out.println("It is palindrome");
                 
        } else {
            System.out.println("It is not plaindrome");
         }
    }
    
}
