//create a generics method that finds the smallest element in a array
package generics;
public class SmallestElements {
   public static<T extends Number> void smallest(T array[])
   {
       
       T s=array[0];
       for(T v:array){
         if(v.doubleValue()<s.doubleValue()){
             s=v;
         }  
       } 
       System.out.println("smallest="+s);
        } 
   
  
   

    public static void main(String[] args) {
        Integer intArray[]={5,6,8,4};
        smallest(intArray);
        Double doubleArray[]={2.3,3.5,4.5};
            smallest(doubleArray);
        }
        
    }

