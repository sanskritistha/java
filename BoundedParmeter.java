
package generics;


public class BoundedParmeter {
    public static<T extends Number>T add(T a,T b){
      if (a instanceof Integer && b instanceof Integer){
           
       
        Integer c=(Integer)a+(Integer)b;
           return (T) c;
        
    }
       else if(a instanceof Double && b instanceof Double ){
           
           Double c=(Double)a+(Double)b;
           return(T) c;
       }
       return null;    
       }

       
    
    public static void main(String[] args) {
        Integer a=4,b=5;
        System.out.println(add(a,b));

        Double c=2.5,d=3.4;
        System.out.println(add(c,d));
    }
}