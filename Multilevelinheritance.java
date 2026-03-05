class Vehicle{
    String Brand;
    double speed;
    Vehicle(String Brand,double speed){
        this.Brand=Brand;
        this.speed=speed;
    }
    void displaydetails(){
        System.out.println("Brand:"+Brand);
        System.out.println("Speed:"+speed);

    }
}

class Car extends Vehicle{
    String fuelType;
    Car(String Brand,double speed,String fuelType){
        super(Brand,speed);
        this.fuelType=fuelType;
    }
    void displaydetails(){
        super.displaydetails();
        System.out.println("Fuel Type:"+fuelType);
    }

}
class Sportscar extends Car{
    double accelerationtime;
    Sportscar(String Brand,double speed,String fuelType,double accelerationtime){
        super(Brand,speed,fuelType);
        this.accelerationtime=accelerationtime;
    }
    void displaydetails(){
        super.displaydetails();
        System.out.println("Acceleration Time:"+accelerationtime);
    
}
}
public class Multilevelinheritance{
    public static void main(String[] args){
        Sportscar car1=new Sportscar("Ferrari",200,"Petrol",3.5);
        car1.displaydetails();
    }
}