
package filehandling;
import java.io.*;
import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter symbolno,name,email:");
        int sn=ob.nextInt();
        String name=ob.next();
        String email=ob.next();
    
      
        try{
            FileOutputStream fout=new FileOutputStream("student.txt");
             DataOutputStream dout=new DataOutputStream(fout); 
             dout.writeInt(sn);
             dout.writeUTF(name);
             dout.writeUTF(email);
             dout.close();
             fout.close();
    }
        catch(Exception ex){
            System.out.println(ex);
        }
    
}
}
