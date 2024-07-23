//create a class Number with three integer instance variables x,y,z
class Number{
    private int x,y,z;

    Number(int x,int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

   
     public int getMax(){
         if(x>y &&x>z)
         return  x;
         else if(y>z)
             return y;
         else
             return z;
     }  
    }
public class NumberDemo {
    public static void main(String[] args) {
        Number n=new Number(3,4,2 );
       
    
        System.out.println("largest="+n.getMax());
    }
}
    

