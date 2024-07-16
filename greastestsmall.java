//create an array to store 10 number in array and find the greatest and smallest number
import java.util.*;
public class greastestsmall {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[10];
        int smallest=a[0];
        int greatest=a[0];
        System.out.println("enter 10 number");
        for(int i=1;i<10;i++){
            a[i]=ob.nextInt();
            if(a[i]>greatest){
                greatest=a[i];
            }else if(a[i]<smallest){
                smallest=a[i];
            }
        }
            System.out.println("greatest number is:"+greatest);
            System.out.println("smallest number is:"+smallest);
                
            
          
    }
    
}


