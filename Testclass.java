interface Calculation{
    void add(int a, int b);
    int multiply(int a, int b);
    
}
class CalculationDemo implements Calculation{
    public void add( int a, int b){
        System.out.println("addition is:"+(a+b));
        
    }
    public int  multiply(int a, int b){
        return a*b;
        
    }
}


public class Testclass {
    public static void main(String[] args) {
        CalculationDemo ob=new CalculationDemo();
        ob.add(2, 3);
        System.out.println("product="+ob.multiply(4,6));
    }
    
}

