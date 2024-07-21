class personnn{
    private String name,adress;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Teachers extends personnn{
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
    
    class PartimeTeacher extends Teachers{
        int numperiod;

        public int getNumperiod() {
            return numperiod;
        }

        public void setNumperiod(int numperiod) {
            this.numperiod = numperiod;
        }
    }

        
public class Multilevelinheritence {
    public static void main(String[] args) {
       PartimeTeacher t1 =new PartimeTeacher();
        
        t1.setName("ram");
        t1.setAdress("ktm");
        t1.setAge(35);
        t1.setSalary(35000);
        t1.setNumperiod(4);
    
        System.out.println("Name:"+t1.getName());
        System.out.println("Adress:"+t1.getSalary());
          System.out.println("age:"+t1.getAge());
          System.out.println("salary:"+t1.getSalary());
          System.out.println("num period:"+t1.getNumperiod());
    }
          
}
  
   
    
    

