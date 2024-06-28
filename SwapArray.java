//WAP a generics method to swap any two elements of an array
package generics;

public class SwapArray {
    public static<T> void swap(T array[],int i,int j){
        T temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        
    }
    public static void main(String[] args) {
        Integer a[]={5,6,8,4};
        
       // swap(a,0,1);
        System.out.println("Before calling swap");
        for(Integer m:a)
            System.out.print(m+" ");
        System.out.println();
        swap(a,0,1);
        System.out.println("After calling Swap");
        for(Integer m:a)
            System.out.print(m+" ");
        System.out.println();
            
    }
 
}
