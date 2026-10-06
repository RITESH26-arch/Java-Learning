public class MultiCatchDemo {
    static void process(int choice) throws BookLimitExceededException,InvalidMemberException{
        if(choice == 1){
            throw new BookLimitExceededException("\nYou have reached the your borrowing limit !");
        }
        else if(choice == 2){
            throw new InvalidMemberException("\nThis member is INVALID !");
            }
            else{
                System.out.println("\nAll Good !");
            }
    }
}
