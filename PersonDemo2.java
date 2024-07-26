class Person2{
    private String name,address;//instance varaiable
    private int age;//instance varaiable
    public void setInfo(String name,String address, int age)//prameterized
    {
        this.name=name;
       this. address=address;
       this. age=age;
    }
    public void ShowInfo(){
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("age="+age);
    }
}
        
    

public class PersonDemo2 {
    public static void main(String[] args) {
        Person2 p=new Person2();
        p.setInfo("ram","ktm",20);
        p.ShowInfo();
        
    }
}
 