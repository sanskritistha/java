
package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //to print the first 10 fibonnaci number
       for(int i=1;i<=10;i++){
        System.out.println(fibo(i));
    }
    }
 static int fibo(int n)   
 {
     if(n==0)
     {
         return 0;
     } else if(n==1)
         return 1;
     else
         return fibo(n-1)+fibo(n-2);
 }
}
