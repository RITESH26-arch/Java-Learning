import java.util.*;
public class MultiCatchMain {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the choice : ");
        try{
            choice = sc.nextInt();
            MultiCatchDemo.process(choice);
        }
        catch(BookLimitExceededException | InvalidMemberException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("\nSomething went wrong, please try again");
        }


        
    }
}
