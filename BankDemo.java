class Bank{
    private String custId,custName,accno;
    private double balanceAmt;
    public void setCustomerDetails(String i, String n,String a, double b){
        custId=i;
        custName=n;
        accno=a;
       balanceAmt=b;   
    }
    public void ShowcustomerDetails(){
        System.out.println("custId="+custId);
        System.out.println("custName=" +custName);
        System.out.println("accno="+accno);
        System.out.println("balanceAmt="+balanceAmt);
    }
    public void deposit(double amount){
       balanceAmt=balanceAmt+amount;//balanceAmt+=amount;
        System.out.println("deposited amount="+amount);
        System.out.println("New Balance after deposit="+balanceAmt);
    }
    public void Withdraw(double amount){
        if(balanceAmt>=amount){
            balanceAmt=balanceAmt-amount;
           
            System.out.println("Withdrawn amount="+amount);
            System.out.println("New balance after withdrawn="+balanceAmt);
        }
        else{
            System.out.println("not enough balance");
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setCustomerDetails("ss123","sofiya","2134",24000);
        b.ShowcustomerDetails();
        b.deposit(24000);
        b.Withdraw(55000);
        
        
        
    }
}
    

