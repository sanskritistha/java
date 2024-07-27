
public class PrimeBetween {
    public static void main(String[] args) 
    {
       
        for(int n=100;n<=200;n++)
        {
            boolean isPrime=true;
            
        for(int i=2;i<=n/2;i++)
         {
             if(n%i==0)
             {
                 isPrime=false;
                 break;
                 
             }
         }
         if(isPrime==true){
         System.out.println(n);
        }
    }
}
} 

    

