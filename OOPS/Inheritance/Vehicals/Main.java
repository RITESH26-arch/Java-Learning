import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Car details you want to enter");
        int noOfDetails = sc.nextInt();
        sc.nextLine();

        if(noOfDetails==1){
        System.out.println("Enter the Brand of the car => ");
        String brand = sc.nextLine();
        System.out.println("Enter the name of the car => ");
        String name = sc.nextLine();
        System.out.println("Enter the number of doors of the car => ");
        int noOfDoors = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the type of the car => ");
        String type = sc.nextLine();
        System.out.println("Enter the Registration number of the car => ");
        String carNumber = sc.nextLine();
        Car c = new Car(brand,noOfDoors,name,type,carNumber);
        c.Display();

        }
        else if(noOfDetails==2){
        System.out.println("Enter the Brand of the car => ");
        String brand = sc.nextLine();
        System.out.println("Enter the name of the car => ");
        String name = sc.nextLine();
        System.out.println("Enter the number of doors of the car => ");
        int noOfDoors = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the type of the car => ");
        String type = sc.nextLine();
        System.out.println("Enter the Registration number of the car => ");
        String carNumber = sc.nextLine();
        Car c = new Car(brand,noOfDoors,name,type,carNumber);

        System.out.println("Enter the Brand of the car => ");
        String brand1 = sc.nextLine();
        System.out.println("Enter the name of the car => ");
        String name1 = sc.nextLine();
        System.out.println("Enter the number of doors of the car => ");
        int noOfDoors1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the type of the car => ");
        String type1 = sc.nextLine();
        System.out.println("Enter the Registration number of the car => ");
        String carNumber1 = sc.nextLine();
        Car c1 = new Car(brand1,noOfDoors1,name1,type1,carNumber1);

        c.Display();
        c1.Display();
        }
        
        sc.close();

    }
}
