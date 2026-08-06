public class Book {
    String name;
    String title;
    double price;
    int pages;

    void details(){
        System.out.println("Name => " + name + "\n Title => " + title + " \n Pages => " + pages +  " \n Price => " + price);
    }

    void discountedPrice(double percent){
        price = price - (price * percent  / 100);
        System.out.println(" \n Discounted Price => " + price);
    }

}
