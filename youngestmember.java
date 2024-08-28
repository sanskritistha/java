import java.util.*;
class Student{
    private String name,faculty;
    private int age;
    public void setName(String name){
        this.name=name;
        
        
    }
    public String getName(){
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class youngestmember{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        Student s[]=new Student[3];
        //now create 100 student objects
        for( int i=0;i<3;i++){
            s[i]=new Student();
        }
  //input values and store them
  for( int i=0;i<3;i++){
      System.out.println("Enter name,age,faculty");
      String n=ob.next();
      int a=ob.nextInt();
      String r=ob.next();
      s[i].setName(n);
      s[i].setAge(a);
      s[i].setFaculty(r);
  }
  //now find the youngest age
  int y=s[0].getAge();
  for(int i=0;i<3;i++){
      if(s[i].getAge()<y){
          y=s[i].getAge();
      }
  }
  //now print the details of youngest student
  for(int i=0;i<3;i++){
      if(s[i].getAge()==y){
          System.out.println(s[i].getName()+" "+s[i].getAge()+" "+s[i].getFaculty());
      }
  }
    }
    
}
