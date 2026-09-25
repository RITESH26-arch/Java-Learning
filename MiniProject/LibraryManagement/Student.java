public class Student extends Member {
    Student(int memberId, String memberName, int issueDate, int bookSubmittingDate, String month, String bookName){
        super(memberId, memberName, 3, 7);
        setIssueDate(issueDate);
        setBookSubmittingDate(bookSubmittingDate);
        setMonth(month);
        setBookName(bookName);
    }

    @Override
    double calculateFine(){
        if(bookSubmittingDate > daysOverDue){
            int fineDays = bookSubmittingDate - daysOverDue;
            this.fine = fineDays * 2;
        }
        else{
            this.fine = 0.0;
            System.out.print("\nNo Fine !");
        }
        return fine;
    }
}