class AA{
    public void print(){
        System.out.println("inside AA");
    }        
}
class BB extends AA{
   
   
    public void print(){
        super.print();
        System.out.println("inside BB");
    }        
}
public class MethodOverrideExample {
    public static void main(String[] args) {
        BB ob=new BB();
        ob.print();
    }
}
        
    
    

