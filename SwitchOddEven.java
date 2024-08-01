import java.util.*;
public class SwitchOddEven {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int n=ob.nextInt();
        int r=n%2;
        switch(r)
        {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
        
        }
    }
}
