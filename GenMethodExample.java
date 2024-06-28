
package generics;
class GenMeth{
    public <T> void print(T m){
        System.out.println(m);
    }
    
}
public class GenMethodExample {
    public static void main(String[] args) {
        GenMeth gm=new GenMeth();
        gm.print(5);
        gm.print("hello");
        gm.print(2.5);
        
    }
    
}
