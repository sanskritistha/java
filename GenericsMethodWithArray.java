
package generics;
class GenMethArray{
    public<E> void printArray(E inputArray[]){
        for(E value:inputArray){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
public class GenericsMethodWithArray {
    public static void main(String[] args) {
        GenMethArray gma=new GenMethArray();
        Integer intArray[]={5,6,7,8};
        gma.printArray(intArray);
        Double doubleArray[]={1.5,2.4,3.5};
        gma.printArray(doubleArray);
        
    }
   
}

