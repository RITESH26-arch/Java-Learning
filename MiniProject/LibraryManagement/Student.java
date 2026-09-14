public class Student extends Member {
    private int issueDate,daysOverDue,bookSubmittingDate,noOfBooks=0;
    private String month,bookName;
    private double fine;

    void setMonth(String month){
        this.month = month;
    }

    void setIssueDate(int issueDate){
        if(issueDate > 0 && issueDate < 30){
            this.issueDate = issueDate;
            setDaysOverDue();
        }
        else
            System.out.println("INVALID DATE!!");
    }

    void setDaysOverDue(){
        this.daysOverDue = this.issueDate + 7;
    }

    void setBookSubmittingDate(int bookSubmittingDate){
        if(bookSubmittingDate > 0 && bookSubmittingDate <= 30)
            this.bookSubmittingDate = bookSubmittingDate;
        else
            System.out.println("INVLAID DATE !!");
    }

    void setBookName(String bookName){
        this.bookName = bookName;
        noOfBooks++;
    }

    Student(int memberId,String memberName,int issueDate,int bookSubmittingDate,String month,String bookName){
        super(memberId,memberName);
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
            else
                System.out.print("\nNo Fine !");    
        return fine;
    }

    @Override 
    int maxBookAllowed(){
        int maxBookAllowed = 3;
        return maxBookAllowed;
    }

    

    @Override 
    public void displayMemberInfo(){
        super.displayMemberInfo();
        System.out.println( "\nBook Name => " + bookName + "\nNo.of Books => " + noOfBooks + 
        "\nMax Books allowed to issue => " + maxBookAllowed() + " Books" +
        "\nBook issued date => " + issueDate + "\nBook return due date => " + daysOverDue + 
        "\nBook returning date => " 
        + bookSubmittingDate + "\nFine => " + fine + "Rs" + "\nMonth => " + month);
    }
}
