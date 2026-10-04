    public class TestError {
        public void issueBook() throws BookLimitExceededException {
            throw new BookLimitExceededException("\nLimit Reacched !");
        }
    }
