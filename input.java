import java.util.*;
public class input{
public static void main(String[] args){
Scanner myobj= new Scanner(System.in);
System.out.println("Enter name Class and mark:");
String name=myobj.nextLine();
int Class=myobj.nextInt();
double mark=myobj.nextDouble();
System.out.println("Name:"+name);
System.out.println("Class:"+Class);
System.out.println("Mark:"+mark);
}
}
