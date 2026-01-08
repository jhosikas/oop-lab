public class Avg{
public int favg(int num1, int num2,int num3){
return (num1+num2+num3)/3;
}
public static void main(String args[]){
Avg jk=new Avg();
int avg=jk.favg(77,88,99);
System.out.println("AVG="+avg);
}
}