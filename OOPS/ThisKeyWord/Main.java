public class Main {
    public static  void main(String[] args){
        Rectangle r = new  Rectangle(10,20);
        r.Display();

        Counter c = new Counter(2);
        c.increment().increment().increment();
        System.out.println("Incremented value => " + c.count);
    }
    
}
