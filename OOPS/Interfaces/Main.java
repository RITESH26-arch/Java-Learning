public class Main{
    public static void main(String[] args){
        Insurance i = new Car("Honda",4,"Accord","Sedan","MH 12 Ev 1251");
        i.showInsurance();

        i.setBrand("BMW"); // it will return an error as the reference type is of insurance and in interface it dosent matter the actual object tyepe the compiler only checkes the refernce over he
    }
}
