//Wap a generic method that returns the miiddle elements of an array
package generics;

public class ReturnArray {
   public static<T> T mid(T array[]){
        return array[array.length/2];
    }
    public static void main(String[] args) {
        Integer a[]={5,6,8,4};
        System.out.println(mid(a));
        String b[]={"Apple","BAll","CAT"};
        System.out.println(mid(b));
    }
 
}
 

