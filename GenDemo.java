 //creating a generics class
package generics;

class Gen<T>//t leknu compulsary xaina
{
   private T ob;//declare an object of type T
    //creating generics constructor
    public Gen(T o){
        ob=o;
    }
   public T getob(){
        return ob;
    }
}
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer>iob=new Gen<Integer>(10);
        int v=iob.getob();
        System.out.println(v);
        Gen<String>sob=new Gen<String>("hello");
        String s=sob.getob();
        System.out.println(s);
    }
    
}
