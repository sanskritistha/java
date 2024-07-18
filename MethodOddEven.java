import java.util.*;
public class MethodOddEven {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
  
System.out.println("enter a numbers");
int n= ob.nextInt();
check(n);
    }
    static void check(int n){
        if(n%2==0)
        {
            System.out.println("the given number is even");
                    
        }else{
            System.out.println("the given number is odd");
        }
    }
            
    
}
