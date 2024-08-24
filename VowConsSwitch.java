import java.util.*;
public class VowConsSwitch {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a letter:");
         char c= ob.next().charAt(0);
         char z=Character.toUpperCase(c);
                 
         switch(z){
              case'A':
               case'E':
               case'I':
                case'O':
                case'U':
                    System.out.println( c+" is vowel ");
                    break;
                default:
                    System.out.println( c+" is consontant ");
         }
    }
}
                            
                            
                            
                            
                            
                            




             
    
    

