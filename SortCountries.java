
package stringhandling;

import java.util.Scanner;

public class SortCountries{
    
    public static void main(String[] args) {
        
    
    Scanner ob=new Scanner(System.in);
  System.out.println("enter name  of 5 countries");
  String countries[]=new String[5];
  for(int i=0;i<5;i++){
      countries[i]=ob.next();
  }
  for(int i=0;i<5;i++){
  for(int j=i+1;j<5;j++){
      if(countries[i].compareTo(countries[j])>0){
          String temp=countries[i];
          countries[i]=countries[j];
          countries[j]=temp;
          
      }    
      }
  }
      System.out.println("After sorting");
     for(  int i=0;i<5;i++){
          System.out.println(countries[i]);
      }
      }
    }


  
        
                
    




    

