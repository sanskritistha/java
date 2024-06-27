package filehandling;
import java .io.*;
public class CountVowel {
    public static void main(String[] args) {
        try{
            
            FileInputStream fin=new FileInputStream("chok.txt");
                    //("tu.txt");
            int ch,v=0;
         while((ch=fin.read())!=-1){
             char a=(char)ch;
             if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
                 v++;
         }              
          fin.close();
            System.out.println("no of vowels="+v);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
