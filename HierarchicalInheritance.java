class Employee{
    String Name;
    String Designation;
    int salary;
    Employee(String Name, String Designation, int salary){
        this.Name = Name;
        this.Designation = Designation;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employee{
    String ProgrammingLanguage;
    Developer(String Name, String Designation, int salary, String ProgrammingLanguage){
        super(Name, Designation, salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }
    void display(){
        super.display();
        System.out.println("Programming Language: " + ProgrammingLanguage);
    }
}
class Manager extends Employee{
    int TeamSize;
    Manager(String Name, String Designation, int salary, int TeamSize){
        super(Name, Designation, salary);
        this.TeamSize = TeamSize;
    }
    void display(){
        super.display();
        System.out.println("Team Size: " + TeamSize);
    }

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", "Software Developer", 80000, "Java");
        Manager mgr = new Manager("Bob", "Project Manager", 90000, 5);
        
        System.out.println("Developer Details:");
        dev.display();
        
        System.out.println("\nManager Details:");
        mgr.display();
    }
}
