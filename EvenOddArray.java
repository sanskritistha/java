import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
        
    Scanner ob=new Scanner(System.in);
    int a[]=new int[10];
         int s=0;
         int p=0;
         System.out.println("enter 10 number");
          for(int i=0;i<10;i++)
          {
              a[i]=ob.nextInt();
              if(a[i]%2==0){
              s=s+a[i];              
          }else{
                  p=p+a[i];
              }
        
          
                  System.out.println("sum="+s);
                 System.out.println("sum="+p);
                   }
    }
    
}
