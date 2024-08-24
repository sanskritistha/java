
public class VoidSum {
    public static void main(String[] args) {
        sum(3,4,5);
    }
    static void sum(int...a){
        int s=0;
                for(int m:a){ 
                    s=m+s;
                }
                System.out.println("sum is"+s);
        
    }
      
    
}
