public class Vehical {
    private String brand;
    private int noOfDoors;

    void setBrand(String brand){
        this.brand = brand;
    }

    void setNoOfDoors(int noOfDoors){
        if(noOfDoors<=0)
            System.out.println("Enter valid no.of Doors !");
        else
            this.noOfDoors = noOfDoors;
    }
    
    Vehical(String brand,int noOfDoors){
        setBrand(brand);
        setNoOfDoors(noOfDoors);
    }
    
    Vehical(String brand){
        setBrand(brand);
    }

    Vehical(int noOfDoors){
        setNoOfDoors(noOfDoors);
    }

    void Display(){
        System.out.println("\nBrand => " + brand + "\nNumber of Doors => " + noOfDoors);
    }

}
