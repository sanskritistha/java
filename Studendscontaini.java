
package stringhandling;

import java.util.Scanner;


public class Studendscontaini {
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter name  of 5 student");
  String students[]=new String[5];
  for(int i=0;i<5;i++){
      students[i]=ob.next();
  }
        System.out.println("name contain i"); 
    for(String c:students){
        if(c.contains("i")){
            System.out.println(c);
        }
                
    }
}
}


    
