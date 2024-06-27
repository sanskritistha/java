
package filehandling;

import java.io.*;
import java.util.*;



public class LineofText {
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
        System.out.println("enter a line of text");
    
    try{
       FileOutputStream fout=new FileOutputStream("chok.txt",true);
       String s=ob.nextLine();
       byte b[]=s.getBytes();
       fout.write(b);
       fout.close();
    }
       catch(Exception ex){
           System.out.println(ex);
       }
    }  
}

    

