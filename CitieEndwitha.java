
package stringhandling;

import java.util.Scanner;

public class CitieEndwitha {
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter name  of 5 cities");
  String countries[]=new String[5];
  for(int i=0;i<5;i++){
      countries[i]=ob.next();
  }
        System.out.println("name end with a"); 
    for(String c:countries){
        if(c.endsWith("a")){
            System.out.println(c);
        }
                
    }
}
}



