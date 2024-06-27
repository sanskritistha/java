
package filehandling;
import java.io.*;
//import java.util.*;
public class WriteCopyRead {
    public static void main(String[] args) {
      /* Scanner ob=new Scanner(System.in);
        System.out.println("enter a line of text");
         String s=ob.nextLine();
         byte b[]=s.getBytes();
        try{
            //write
            FileOutputStream fout=new FileOutputStream("tu.txt");
            fout.write(b);
            fout.close();
            //copy
            FileInputStream fin=new FileInputStream("tu.txt");
            FileOutputStream fout1=new FileOutputStream("ku.txt");
            int ch;
             while((ch=fin.read())!=-1){
             fout1.write(ch);
        }*/
             //read
             try{
              FileInputStream fin1=new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\BIM2Java\\src\\filehandling\\WriteCopyRead.java");
              int ch1;
              while((ch1=fin1.read())!=-1){
                  System.out.print((char)ch1);
                  
              }
            fin1.close();
         
        
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
