class Person1{
    private String name,address;
    private int age;
    public void setInfo(){
        name="ram";
        address="ktm";
        age=20;
    }
    public void ShowInfo(){
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("age="+age);
    }
}
        
public class PersonDemo1 {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.setInfo();
        p.ShowInfo();
        
        
        
    }
    
}
