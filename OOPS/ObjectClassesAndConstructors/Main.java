import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    /* For Car Class */
    Car car1 = new Car();
    car1.name = "BMW M5 CS";
    car1.colour = "black";
    car1.type = "sedan";
    car1.speed = "300 kmph";
    car1.Drive();
    System.out.println();

    /* For Book Class */
    Book b1 = new Book();
    b1.name =  "Froged in Fire";
    b1.title = " We make the Ancient Wepons related to some of worlds biggest and rareest battels in the history ";
    b1.pages = 250;
    b1.price = 2000;
    b1.details();
    b1.discountedPrice(15);
    System.out.println();

    /* For Student Class */
    System.out.println("Enter Students Roll number");
    int rollNo = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Students name => ");
    String  name = sc.nextLine();
    System.out.println("Enter Students Percentage => ");
    double percentage = sc.nextDouble();
    Student s1 = new Student(rollNo,name,percentage);
    s1.display();
    sc.close();



    }
    
}
