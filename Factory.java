
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Factory
{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike(1,2);
        Boat boat = new Boat();
        car.setCompany();
        car.move();
        car.move(14);
        bike.setCompany("Kawasaki Ninja");
        boat.setCompany("Yamaha");
        bike.move(21);
        boat.move(12);
        car.Stop(0,false,true);
    } 
}

class Vehicle{
    private String manufacturer;
    private String engine;
    int wheels;
    int headlights;
    boolean brake;
    boolean sparkplug;
    int speed;
    public void start(){
        sparkplug = true;
        brake = true;
    }
    private void engineRun(){
        
    }
    public void move(){
        brake = false;
        sparkplug = true;
        speed = 10;
        System.out.println("Vehicle is moving");
    }
    
    public Vehicle(){
        sparkplug = false;
        speed = 0;
        brake = true;
    }
}

class Car extends Vehicle{
    private String company;
    public Car(){
        wheels = 0;
        headlights = 0;
    }
    private void engineRun(){}
    public void Stop(int speed,boolean sparkplug,boolean brake){
        //Stop by assigning values through parameters
        System.out.println("Car is stopped");
    }
    public void setCompany(){
        company = "Aston Martin";
    }
    
    public void move(int speed){
        brake = false;
        sparkplug = true;
        this.speed = speed;
        System.out.println(company+" is moving with a speed of "+speed);
    }
}
class Bike extends Vehicle{
    private void engineRun(){}
    public Bike(int headlights,int wheels){
        this.headlights = headlights;
        this.wheels = wheels;
    }
    private String company;
    public void Stop(){
        System.out.println("Bike is stopped by running out of fuel");
    }
    public void Stop(int speed,boolean sparkplug,boolean breake){
        //Stop by assigning values through parameters
        System.out.println("Bike is stopped");
    }
    public void setCompany(String company){
        //Assigning company name
        this.company = company;
    }
    public void move(int speed){
        brake = false;
        sparkplug = true;
        this.speed = speed;
        System.out.println(company+" is moving with a speed of "+speed);
    }
}
class Boat extends Vehicle{
    public Boat(){
        wheels = 0;
        headlights = 0;
    }
    private void engineRun(){}
    private String company;
    private String fuel;
    public void Stop(int speed,boolean sparkplug,boolean breake){
        System.out.println("Boat is stopped");
    }
    public void setCompany(String name){
        //Assigning company name
        company = name;
    }
    public void move(int speed){
        brake = false;
        sparkplug = true;
        this.speed = speed;
        System.out.println(company+" is moving with a speed of "+speed);
    }
    public void setFuel(){
        
    }
}
