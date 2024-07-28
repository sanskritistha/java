import java.util.*;
public class Season {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the months");
        int n=ob.nextInt();
        switch(n){
            case 1:
            case 11:
            case 12:
                System.out.println("spring");
                break;
         case 2:
         case 3:
         case 4:
                System.out.println("summer");
                break;
         case 5:
         case 6:
         case 7:
                System.out.println("autum");
                break;
         case 8:
         case 9:
         case 10:
                System.out.println("winter");
                break;
         default:
             System.out.println("invaild");
               break;
        }
    }
}

        
        
        
    

