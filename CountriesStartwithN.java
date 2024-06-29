
package stringhandling;

import java.util.Scanner;

public class CountriesStartwithN {
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter name  of 5 countries");
  String countries[]=new String[5];
  for(int i=0;i<5;i++){
      countries[i]=ob.next();
  }
        System.out.println("name Startting with N"); 
    for(String c:countries){
        if(c.startsWith("N")){
            System.out.println(c);
        }
                
    }
}
}

