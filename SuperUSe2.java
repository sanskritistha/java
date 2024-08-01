//to acess hidden number
class AB{
    int m=10,n=20;
}
class Ac extends AB{
    int p=10,n=200;
    void sum(){
       int s=m+n+p;
        System.out.println(s);
        int s1=m+super.n+p;
        System.out.println(s1);
    }
}
public class SuperUSe2{
    public static void main(String[] args) {
        Ac ob=new Ac();
        ob.sum();
            
        }
    }
    
