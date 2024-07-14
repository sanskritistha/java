class Employe{
    private String name,address;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   
    
    
            
    
}
public class EmployeDemo {
    public static void main(String[] args) {
        Employe e=new Employe();
        e.setName("ram");
        e.setAddress("ktm");
        e.setSalary(500000);
        System.out.println("Name:"+e.getName());
         System.out.println("Address:"+e.getAddress());
          System.out.println("Salary:"+e.getSalary());
        
        
    }
    
}
