//wap to store name,address,salary of 5 employees into a file"emp.txt".also reas from the file and print its content.
package filehandling;

import java.io.*;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
      
        try{
            FileOutputStream fout=new FileOutputStream("emp.txt");
             DataOutputStream dout=new DataOutputStream(fout); 
             for( int i=1;i<=5;i++){
             System.out.println("enter name,adress,salary:");
        
        String name=ob.next();
        String address=ob.next();
        int salary=ob.nextInt();
    
             
             dout.writeUTF(name);
             dout.writeUTF(address);
             dout.writeInt(salary);
             }
             dout.close();
             fout.close();
    
    
       
            FileInputStream fin=new FileInputStream("emp.txt");
            DataInputStream din=new DataInputStream(fin);
            while(din.available()>0){
                System.out.println("Name:"+din.readUTF());
                System.out.println("Adress:"+din.readUTF());
                System.out.println("Salary:"+din.readInt());
            }
            fin.close();
            din.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    
}
    }


    

