//wap to multiply two number using recursive function
package Recursion;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply(5,5));
        
    }
    static int multiply(int a, int b)
    {
        if(b==0)
            return a;
        else
            return a+multiply(a,b-1);
    }
    
}
