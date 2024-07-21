interface Hi{
    void sayHi();
    
}
interface Hello{
    void sayHello();
    
    
}
class Greet implements Hi,Hello{
    public void sayHi(){
        System.out.println("hi");
    
}
    public void sayHello(){
        System.out.println("hello");
    }
    
}
public class MultipleInheritence1 {
    public static void main(String[] args) {
        Greet ob=new Greet();
        ob.sayHello();
        ob.sayHi();
    }
}