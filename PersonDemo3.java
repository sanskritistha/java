class Person{
    private String Firstname,lastname;
    private int age;
    public Person(String Firstname, String lastname,int age){
        this.Firstname=Firstname;
        this.lastname=lastname;
        this.age=age;
        
    }
    public void showInfo(){
        System.out.println("first name="+Firstname);
        System.out.println("lastname="+lastname);
        System.out.println("age="+age);
    }
}
class Student extends Person{
    private String faculty;
    public Student(String Firstname, String lastname,int age,String faculty){
        super(Firstname,lastname,age);
this.faculty=faculty;

    }
 
    public void ShowInfo(){
        super.showInfo();
        System.out.println("faculty="+faculty);
    }}
    class Teacher extends Person{
    private double salary;
    public Teacher(String Firstname, String lastname,int age,double salary){
        super(Firstname,lastname,age);
this.salary=salary;
}
   
    }
public class PersonDemo3 {
    public static void main(String[] args) {
        Student s=new Student("sabin","shrestha",19,"Bim");
        Teacher t=new Teacher("kabita","kc",31,20000);
        System.out.println("student details");
s.showInfo();
        System.out.println("Teacher details");
t.showInfo();  
    }
    
    
}
    

