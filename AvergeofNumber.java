
package generics;

public class AvergeofNumber {
    public static<T extends Number> void avg(T array[]){
      double s=0.0;
      for(T n:array){
          s=s+n.doubleValue();
      }
        System.out.println("Average="+(s/array.length));
    }

    public static void main(String[] args) {
        Integer intArray[]={5,6,8,4};
        avg(intArray);
        Double doubleArray[]={2.3,3.5,4.5};
          avg(doubleArray);
    }
    
}
