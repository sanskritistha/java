interface Item{
    String name="Fan";
    double price =2400;
    void ShowInfo();
}
class ItemDetails implements Item{
    public void ShowInfo(){
        System.out.println("Item Name:"+name);
        System.out.println("price:"+price);
    
    }
}
public class ImplementingInterface {
    public static void main(String[] args) {
        ItemDetails ob= new ItemDetails();
        ob.ShowInfo();
    }
    
}
