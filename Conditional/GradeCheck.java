import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Please Enter your Grade between 1 - 5 ");
        int grade = sc.nextInt();

        switch(grade){
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Very Good");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Average");
                break;
            case 5:
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid Grade !!");

        }
        sc.close();
    }
    
}
