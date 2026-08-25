
public class Main{
    public static void main(String[] args){
        Insurance i = new Car("Honda",4,"Accord","Sedan","MH 12 Ev 1251");
        i.displayInsurance();
        Insurance.renewableInsurance(); // this is the way to call a static method of interface with the INTERFACE NAME and METHOD NAME
        
        i.renewableInsurance();  // we cannot call a static method of interface through an instance
    
    }
       
}

