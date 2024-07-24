import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ob.nextInt();
        if(n%2==0){
            System.out.println("even="+n);
        }else{
            System.out.println("odd="+n);
        }     
    }
}
