import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length, breadth, length1, breath1;
        int radius;
        System.out.println("\nEnter the Lenght of the Rectangle => ");
        length = sc.nextDouble();
        System.out.println("\nEnter the Breadth of the Rectangle => ");
        breadth = sc.nextDouble();
        Shape s1 = new Shape(length,breadth);

        s1.display();


        System.out.println("\nEnter the Lenght of the Radius  => ");
        radius = sc.nextInt();
        Shape s2 = new Shape(radius);
        s2.display();



    }
}
