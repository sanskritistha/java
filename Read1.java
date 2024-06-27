//a data file "emp.txt" contains name,address,salary of some employess.WAp ti read 
//and display only those records whose salary is more than 25000
package filehandling;
import java.io.*;
import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
       try{
           
            FileInputStream fin=new FileInputStream("emp.txt");
            DataInputStream din=new DataInputStream(fin);
            while(din.available()>0){
                String name=din.readUTF();
                String address=din.readUTF();
                int salary=din.readInt();
                if(salary>25000){//whose adress is "ktm"
                    //if(adress.equalsIgnoreCAse("ktm")){
                    System.out.println(name+" "+address+" "+salary);          
          
            }
            }
            fin.close();
            din.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    
       } 
      
 
    }

