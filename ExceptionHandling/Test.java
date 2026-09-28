public class Test {
    public static void main(String[] args){
        try{
            throw new BookLimitExceededException("You have reached the book borrowing limit !!");
        }
        catch(BookLimitExceededException e){
            System.out.println("Caught : " + e.getMessage());
        }
    }  
}
