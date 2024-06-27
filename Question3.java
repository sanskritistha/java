//whose email has"gmail"domain

package filehandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
      
        try{
            FileOutputStream fout=new FileOutputStream("student.txt");
             DataOutputStream dout=new DataOutputStream(fout); 
             for( int i=1;i<=5;i++){
             System.out.println("enter symbolno,name,email:");
        int sn=ob.nextInt();
        String name=ob.next();
        String email=ob.next();
    if(email.endsWith("gmail.com")){
             dout.writeInt(sn);
             dout.writeUTF(name);
             dout.writeUTF(email);
             }
             }
             dout.close();
             fout.close();
    }
        catch(Exception ex){
            System.out.println(ex);
        }
    
}
}

    



