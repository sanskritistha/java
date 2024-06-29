
package stringhandling;

import java.util.Scanner;

public class PersonGmail {
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter the email of 5 person");
  String Persons[]=new String[5];
  for(int i=0;i<5;i++){
      Persons[i]=ob.next();
  }
        System.out.println("person having gmail domain"); 
    for(String c:Persons){
        if(c.endsWith("gmail.com")){
            System.out.println(c);
        }
                
    }
}
}


    

