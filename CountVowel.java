
package stringhandling;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int v=0;
        System.out.println("enter a word");
        String s=ob.next();
        //String s1=s.toLowerCase();
        for( int i=0;i<s.length();i++){
             char n=s.charAt(i);
           if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
               v++;
           } 
        }
        System.out.println("No.of vowels="+v);  
    }
    
}
