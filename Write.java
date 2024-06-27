//wap to store "chok tira kta ho chowk tira"in a file"chok.txt".
package filehandling;
import java.io.*;
public class Write {
    public static void main(String[] args) {
       try{
       FileOutputStream fout=new FileOutputStream("chok.txt");
       String s="chok tira kta ho chok tira";
       byte b[]=s.getBytes();
       fout.write(b);
       fout.close();
    }
       catch(Exception ex){
           System.out.println(ex);
       }
    
}
}