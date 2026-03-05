class Person{
    String Name;
    int age;
    Person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
}
class Student extends Person{
    int StudentID;
    String course;
    Student(String Name,int age,int StudentID,String course){
        super(Name,age);
        this.StudentID=StudentID;
        this.course=course;
        
    }
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Student ID: "+StudentID);
        System.out.println("Course: "+course);
    }
}
public class Personsingleinheritance{
public static void main(String[] args){
    Student stu=new Student("jk",45,456,"cse");
    stu.display();
}
}
