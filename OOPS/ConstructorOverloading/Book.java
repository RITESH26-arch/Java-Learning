public class Book {
    String title;
    String author;
    double price;
    
    Book(String title,String  author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String title,String author){
        this(title,author,0.0);
    }

    Book(String title){
        this(title,"Unknown",0.0);   
    }
    void Display(){
        System.out.println("The Title => " + title + "\nThr author => " + author + "\nPrice =>" + price);
    }
}
