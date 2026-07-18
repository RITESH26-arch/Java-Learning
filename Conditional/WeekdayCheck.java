import java.util.Scanner;
public class WeekdayCheck {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("PLease enter the Number of the Day");
        int Day = sc.nextInt();

        switch(Day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(Day+" => Weekday");
                break;
            case 6:
            case 7:
                System.out.println(Day+" => Wekend");
                break;
            default:
                System.out.println("Invalid Day");
        }
        sc.close();
    }
    
}
