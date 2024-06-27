
package exceptionhandling;
import java.util.*;
class   InsufficentBalanceException extends Exception{
    public  InsufficentBalanceException(String msg){
        super(msg);
    }
    
}
class Customer{
    int balance=50000;
    public void withdraw(int amount) throws  InsufficentBalanceException{
        if(amount>balance) {
             InsufficentBalanceException ibe=new  InsufficentBalanceException("balance is not enough");
            throw ibe;
        }
        else{
            System.out.println("going to withdraw");
            System.out.println("amount before withdraw:"+balance);
            balance=balance-amount;
            System.out.println("amount after withdraw:"+balance);
        }
            
    }
}
public class Exc4 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int a=ob.nextInt();
        Customer c=new Customer();
        try{
            c.withdraw(a);
        } 
        catch(  InsufficentBalanceException ex){
            System.out.println(ex);
            
        }
    }
    
}

 