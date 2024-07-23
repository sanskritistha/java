import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
        System.out.println("enter the value of n"); 
        int n=ob.nextInt();
        int s=0;
        
        for( int i=1;i<=n;i++){
            s=s+i;
        }
         System.out.println("sum="+s);
        
    }
}
