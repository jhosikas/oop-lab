class Father{

double landarea=20;
String ptype="Barren Land";

void showProperty(){
System.out.println("Total land area is: "+landarea+" acres");
System.out.println("Prperty type: "+ptype);
}
}
class ChildOne extends Father{
String usage="Building House";
void showUsage(){
showProperty();
System.out.println("Child One uses this property to "+usage);
}
}
class ChildTwo extends Father{
String usage="Building School";
void showUsage(){
showProperty();
System.out.println("Child Two uses this property to "+usage);
}
}
public class casestudy1{
public static void main(String[] args){
ChildOne child1= new ChildOne();
ChildTwo child2= new ChildTwo();
System.out.println("CHILD ONE:");
child1.showUsage();
System.out.println("CHILD TWO:");
child2.showUsage();
}
}
