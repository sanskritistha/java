import java.util.*;
public class GreatestOne {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=ob.nextInt();
        int b= ob.nextInt();
        int c= ob.nextInt();
        if (a>b&&a>c ){
            System.out.println(" greatest is"+a);    
        }
        else if(b>c){
        System.out.println("greatest is"+b);
    }
        else{
            System.out.println("greatest is" +c);
        }
    }
        
    
}
