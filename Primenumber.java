
public class Primenumber {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,10};
       boolean primeFound=false;
        for ( int i = 0; i <arr.length;i++) {
          boolean isprime=true; 
         for(int j=2;j<arr[i];j++)
         {
             if(arr[i]%j==0)
             {
                isprime=false;
                 break;    
             }
         }
         if(isprime){
             primeFound=true;
             System.out.println(arr[i]+"is a prime number.");
         }
        }
         if(!primeFound){
             System.out.println(" No prime number found in the array");
}
    }
}
        


       
    
    

 