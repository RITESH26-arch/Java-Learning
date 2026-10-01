public class TestMain {
    public static void main(String[] args){
        int noOfBooks = 3,maxBookAllowed = 3;
    
        try{
            if(noOfBooks >= maxBookAllowed)
                throw new BookLimitExceededException("You cannot borrow more books until you return one book  you have borrowed !");
        }
        catch(BookLimitExceededException e){
            System.out.println(e.getMessage());
        }
    }
}
