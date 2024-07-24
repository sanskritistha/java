//method ovverriding implement
//base class ma constructor xa vane derived class ma pani hunxa

class Shape{
    double dim1,dim2;
    Shape(double d1,double d2){
        dim1=d1;
        dim2=d2;
    } 
    public void area(){
        System.out.println("area of shape undefined");
        
    }
    
}
class  Rectangle extends Shape{
    Rectangle(double d1,double d2){
    super(d1,d2);
}

    public void area(){
        System.out.println("Rectangle  area:"+ dim1*dim2);//system.out.format("rectangle area:.2f",dim1*dim2);
        //sop("");
    }
}
 class Traingle extends Shape{
   Traingle(double d1, double d2){
      super(d1,d2);
              }
               public void area(){
                   System.out.println("Traingle area:"+0.5* dim1*dim2);
               }
 }

public class OverrideImplemenetation {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(4.2,4.7);
        r.area();
        Traingle t=new Traingle(2.4,6.4);
        t.area();
    }
    
}
