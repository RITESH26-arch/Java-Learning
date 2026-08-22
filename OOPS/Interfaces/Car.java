public class Car extends Vehical implements Insurance {
    private String name;
    private String type;
    private String carNumber;

    void setName(String name){
        this.name = name;
    }

    void setType(String type){
        this.type = type;
    }

    void setCarNumber(String carNumber){
        int i = 0;
        boolean valid = true;
        while(i<carNumber.length()){
            if(Character.isWhitespace(carNumber.charAt(i) ) != true && Character.isLetterOrDigit(carNumber.charAt(i)) != true){
                valid = false;
                break;
            }
            else 
                i++;
        }

        if(valid == true)
            this.carNumber = carNumber;
        else
            System.out.println( "\n" +carNumber + " -- INVALID  CAR NUMBER ! \nPlease enter a valid car number");
    }


    Car(String brand,int noOfDoors,String name,String type,String carNumner){
        super(brand, noOfDoors);
        setName(name);
        setType(type);
        setCarNumber(carNumner);
    }

    Car(String brand,int noOfDoors,String name,String type){
        super(brand, noOfDoors);
        setName(name);
        setType(type);
    }

    Car(String brand,int noOfDoors,String name){
        super(brand, noOfDoors);
        setName(name);
    }

    void Display(){
        super.Display();
        System.out.println("Name => " + name + "\nType => " + type + "\nCar number => " +carNumber);
    }

    @Override
    void startEngine(){
        System.out.println("Vrroom Vrrroooommmm !!!!");
    }

    @Override
    public void showInsurance(){
        System.out.println("\nI am a valid Insurance and i am valid till 2030");
    }

    
    
    
}

