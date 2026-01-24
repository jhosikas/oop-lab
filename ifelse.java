import java.util.*;
public class ifelse{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter your marks:");
mark=obj.nextInt();
if mark>=90
{
System.out.println("A");
}
else if mark>=80
{
System.out.println("B");
}
else if mark>=70{
System.out.println("C");
}
else if mark>=60{
System.out.println("D");
}
else if mark>=50{
System.out.println("P");
}
else{
System.out.println("F");
}
}
}