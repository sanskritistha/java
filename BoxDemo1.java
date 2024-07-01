 class Box{
    private double length,breadth,height;
   Box(double length,  double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
   double getVolume(){
        return length*breadth*height;
    }
}
class Boxweight extends Box{
    private double weight;
Boxweight(double length,double breadth, double height){
    super(length,breadth,height);
}
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
   
}
public class BoxDemo1 {
    public static void main(String[] args) {
        Boxweight ob=new Boxweight(1,2,3);
        System.out.println("volume="+ob.getVolume());
    }
    
}
