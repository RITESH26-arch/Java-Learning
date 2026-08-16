public class Vehical {
    private String brand;
    private double speed;

    Vehical(String brand,double speed){
        setBrand(brand);
        setSpeed(speed);
    }

     Vehical(String brand){
        setBrand(brand);
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setSpeed(double speed){
        if(speed<0)
             System.out.println("INVALID SPEED !!");
        else  
            this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public double getSpeed(){
        return speed;
    }

    void Display(){
        System.out.println("\nBrand => " + brand +  "\nSpeed => " + speed);
    }
}
