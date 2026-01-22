import java.util.*;
public class switchcase{
public static void main(String[] args){
Scanner myobj=new Scanner(System.in);
System.out.println("Enter 2 numbers and operation symbol(+,-,X,/):");
int num1=myobj.nextInt();
int num2=myobj.nextInt();
String operation=myobj.next();
switch(operation){
case "+":
System.out.println(num1+num2);
break;
case "-":
System.out.println(num1-num2);
break;
case "*":
System.out.println(num1*num2);
break;
case "/":
System.out.println(num1/num2);
break;
default:
System.out.println("Enter valid operation.");
}
}
}
