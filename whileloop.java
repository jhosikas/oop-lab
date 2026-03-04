import java.util.*;
public class whileloop{
    public static void main(String[]args){
        int mat,eng,phy;
        double score=0;
        boolean result=true;
        Scanner obj=new Scanner(System.in);
        while(result){
            System.out.println("Enter math score:");
            mat=obj.nextInt();
            System.out.println("Enter english score:");
            eng=obj.nextInt();
            System.out.println("Enter physics score:");
            phy=obj.nextInt();
            score=(mat+eng+phy)/3;
            if (score>=60){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
            System.out.println("Do u want to check more result?(true/false)");
            result=obj.nextBoolean();
      
        }
        
    }
}
        