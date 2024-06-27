
package filehandling;
import java.io.*;
public class WriteRead {
    public static void main(String[] args) {
        String s="Tommorow is public holiday";
        try{
                //write
                FileWriter fw= new FileWriter("abc.txt");
                fw.write(s);
                fw.close();
                //read
                FileReader fr=new FileReader("abc.txt");
                int ch;
                while((ch=fr.read())!=-1){
                    System.out.println((char)ch);
                }
        fr.close();
    }
        catch(Exception ex){
            System.out.println(ex);
        }
            
    }     
            
            
            
            
            
    
}
    