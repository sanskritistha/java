//using constructor
class Car{
    private String model,color;
    private int price;
    public Car(){
        model="santro";
        color="blue";
        price=400000;
    }
    public void ShowInfo(){
        System.out.println("Model="+model);
        System.out.println("color=" +color);
        System.out.println("price="+price);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c=new Car();
        c.ShowInfo();
    }
    
}
