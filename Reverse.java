 
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
                int n=ob.nextInt();
                int s=0;
                while(n>0)
                {
                    int r=n%10;
                    s=s*10+r;
                    n=n/10;
                }
                System.out.println("reverse number="+s);
    }
    
}
