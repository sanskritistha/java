class Rectangle{
    private int length,breadth,area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
        //return area;
    }
    public void setArea(int area){
        this.area=area;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        
    
    Rectangle r =new Rectangle();
   r.setLength(6);
    r.setBreadth(5);
  System.out.println("length:"+r.getLength());
        System.out.println("Breadth:"+r.getBreadth());
          System.out.println("area:"+r.getArea());
    }
        
    
}
