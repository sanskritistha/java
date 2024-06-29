
package stringhandling;

import java.util.Scanner;

public class Repalce{
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter name  of 5 fruits");
  String fruits[]=new String[5];
  for(int i=0;i<5;i++){
      fruits[i]=ob.next();
  }
        System.out.println("name Startting with o"); 
    for(String c:fruits){
        System.out.println(c.replace("a", "o"));
        }
                
    }
}



    

