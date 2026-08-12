import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nEnter the Name Of the student");
        String name = sc.nextLine();
        System.out.println("\nEnter the age of Student");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("\nEnter Marks of Studetn");
        double marks11 = sc.nextDouble();


        Student s1 = new Student(name,age,marks11);
        
        s1.Display();
    }
}
