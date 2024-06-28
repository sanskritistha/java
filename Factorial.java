
package Recursion;
public class Factorial {
    public static void main(String[] args) {
        //input from user 
        //int n=ob.nextInt();
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==1)
            return 1;
        else 
            return n*fact(n-1);
                    
    
    }
    
}
