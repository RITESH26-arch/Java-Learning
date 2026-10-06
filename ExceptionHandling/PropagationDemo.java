public class PropagationDemo {

    static void level1() throws BookLimitExceededException{
            System.out.println("\nThis is the level 1 Executing !");
            level2();
            System.out.println("\nlevel 2 Finished Executing !");
        }

        static  void level2() throws BookLimitExceededException {
            System.out.println("\nThis is the second Level Executing !");
            level3();
            System.out.println("\nLevel 2 Finished executing !");
        }

        static void level3() throws BookLimitExceededException{
            throw new BookLimitExceededException("\nDing Ding You cannot borrow anymore books !");
        }


    public static void main(String[] srgs){
        System.out.println("\nlevels Have Started !");
        try{
            level1();
        }
        catch(BookLimitExceededException e){
            System.out.println("\nException has been caight");
        }

    }
        
}
