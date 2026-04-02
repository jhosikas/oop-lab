class Calculator{
public int add(int a,int b){
return a+b;
}
protected int add(int a,int b,int c){
return a+b+c;
}
private double add(double a,double b){
return a+b;
}
public void displaydeci(double x,double y){
double result=add(x,y);
System.out.println("Sum of decimal is:"+result);
}
}
public class Overloading1{
public static void main(String[] args){
Calculator sum=new Calculator();
System.out.println("Sum of 2 integers:"+sum.add(7,8));
System.out.println("Sum of 3 integers:"+sum.add(1,2,3));
sum.displaydeci(6.7,9.9);
}
}
