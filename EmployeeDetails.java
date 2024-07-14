 class Employee{
    private String Firstname,lastname;
     private int salary;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return Firstname+lastname;
    }
    public int getAnualSalary(){
    return salary*12;
}
    
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee E=new Employee();
        E.setFirstname("ram");
        E.setLastname("karki");
        E.setSalary(25000);
        
        System.out.println("Name="+E.getName());
        System.out.println("salary="+E.getAnualSalary());
    }
    
}
