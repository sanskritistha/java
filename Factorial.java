import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        int s=1;
        for(int i=1;i<=n;i++)
        {
            s=s*i;
        }
        System.out.println("factorial="+s);
    }
}
