//by using class and interface
interface College{
    String cname="orchid";
    void showDetails(); 
}
class Student{
    public String  name,faculty;
     public int id;
    Student(int id,String name,String faculty){
        this.id=id;
        this.name=name;
        this.faculty=faculty; 
    }
    public String getName() {
        return name;
    }
    public String getFaculty() {
        return faculty;
    }

    public int getId() {
        return id;
    }
}
class CollegeStudent  extends Student implements College{
    CollegeStudent(int id,String name,String faculty){
        super(id,name,faculty);
    }
    public void showDetails(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Faculty:"+faculty);
        System.out.println("College name="+cname);
    }
    
}
public class MultipleInheritence2{
    public static void main(String[] args) {
        CollegeStudent ob=new CollegeStudent(110,"ram","BIM");
        ob.showDetails();
    }
}
