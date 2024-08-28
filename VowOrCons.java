import java.util.*;
public class VowOrCons {
    public static void main(String[] args) {
        
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the letter");
        char c= ob.next().charAt(0);
        if(c== 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
            System.out.println("vowel="+c);
        else
            System.out.println("consonant="+c);
        
    }
}
 
