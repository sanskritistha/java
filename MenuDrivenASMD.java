import java.util.*;
public class MenuDrivenASMD {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter two number");
       
        int a=ob.nextInt();
        int b=ob.nextInt();

         System.out.println("enter your choice");
        System.out.println("1.Add");
        System.out.println("2.subtract");
        System.out.println("3.multiply");
        System.out.println("4.divide");
        
        int choice=ob.nextInt();
        
        
        switch(choice)
        {
            case 1:
                int c=a+b;
                System.out.println("sum is "+c);
                break;
                case 2:
                int d=a-b;
                System.out.println("subtraction is "+d);
                break;
                case 3:
                int e=a*b;
                System.out.println("product is "+e);
                break;
                case 4:
                int f=a/b;
                System.out.println("division is "+f);
                break;
                default:
                    System.out.println("invaild");
                    break;
                  
        }              
        
    }
}

    
    

