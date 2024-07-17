import java.util.*;
public class KiloMeter {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter distance in miles");
        double m =ob.nextDouble();
        double km = m*1.6;
        System.out.println("kilometer="+km);
    }
    
}