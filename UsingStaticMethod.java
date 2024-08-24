class Calculate{
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("sum="+c);
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}
public class UsingStaticMethod {
    public static void main(String[] args) {
      Calculate.add(5,6);
        int p=Calculate.multiply(5,9);
        System.out.println("product="+p);
    }
}
    

