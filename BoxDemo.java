//create a class Box with private member double length,breadth, height. create a parameterized
//constructor to initalize the instance varaibles. provide two methods public double getArea()and
////volume of Box.provide a class BoxDemo with the main function.create an object of Box class to 
//calculatr area of volume*/
class Box{
    private double length ,breadth,height,area,volume;
    public Box(double n,double a, double b){
        length=n;
        breadth=a;
        height=b;
        
    }
    public double getVolume(){
        volume=length*breadth*height;
        return volume;
          
    }
    public double getArea(){
        area=2*(length*breadth+breadth*height+length*height);
        return area;
        
    }
   
}
public class BoxDemo {
    public static void main(String[] args) {
        Box b=new Box(14,11,7);
        System.out.println("the area of box is:"+b.getArea());
        System.out.println("the volume of box is:"+b.getVolume());
    }
}
        
      
          
        
       
       
    
    

