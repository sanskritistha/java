
package filehandling;
import java.io.*;
public class Read {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("chok.txt");
            int ch;
            while((ch=fin.read())!=-1){
                System.out.println((char)ch);//ascii s.o.p(ch);
            
        }
                   
         fin.close();   
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
