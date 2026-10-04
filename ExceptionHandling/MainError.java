public class MainError {
    public static void main(String[] args){
        TestError t1 = new TestError();

        try{
            t1.issueBook();
        }
        catch(BookLimitExceededException e){
            System.out.println(e.getMessage());
        }
    }
}
