//serializable  and de-serializable
package filehandling;
import java.io.*;
class Person implements Serializable {
    private int id;
    private String name,address;
    Person (int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        
    }
        public void showInfo(){
        System.out.println(id+" "+name+" "+address);
    }
}
public class ReadWriteObj {
    public static void main(String[] args) {
        Person p=new Person(101,"sanskriti","basundhara");
        try{
            //write to file
            FileOutputStream fout=new FileOutputStream("person.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(p);
            out.close();
            fout.close();
            //read from file
            FileInputStream fin=new FileInputStream("person.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            Person p1=(Person)oin.readObject();
            p1.showInfo();
            oin.close();
            fin.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
