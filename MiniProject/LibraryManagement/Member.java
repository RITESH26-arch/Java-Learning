abstract class Member {
    private int memberId, maxBookAllowed, loanPeriodDays;
    private String memberName;

    protected int issueDate, daysOverDue, bookSubmittingDate, noOfBooks;
    protected String month, bookName;
    protected double fine;

    abstract double calculateFine();

    void setLoanPeriodDays(int loanPeriodDays){
        this.loanPeriodDays = loanPeriodDays;
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
        this.daysOverDue = this.issueDate + loanPeriodDays;
    }

    void setBookSubmittingDate(int bookSubmittingDate){
        if(bookSubmittingDate > 0 && bookSubmittingDate <= 30)
            this.bookSubmittingDate = bookSubmittingDate;
        else
            System.out.println("INVLAID DATE !!");
    }

    void setMonth(String month){
        this.month = month;
    }

    void setBookName(String bookName){
        if(noOfBooks >= getMaxBookAllowed()){
            System.out.println("\nCannot issue book! Member has reached the maximum limit of " + getMaxBookAllowed() + " books.");
            return;
        }
        this.bookName = bookName;
        noOfBooks++;
    }

    void returnBook(int bookSubmittingDate){
        setBookSubmittingDate(bookSubmittingDate);
        if(noOfBooks > 0)
            noOfBooks--;
        calculateFine();
    }

    public void displayMemberInfo(){
        System.out.println("\nMember Id => " + memberId + "\nMember Name => " + memberName +
        "\nBook Name => " + bookName + "\nNo.of Books => " + noOfBooks +
        "\nMax Book Allowed => " + getMaxBookAllowed() +
        "\nBook issued date => " + issueDate + "\nBook return due date => " + daysOverDue +
        "\nBook returning date => " + bookSubmittingDate + "\nFine => " + fine + "Rs" +
        "\nMonth => " + month);
    }

    void setMemberID(int memberId){
        if(memberId <= 0)
            System.out.println("Invalid Member Id !! \nPlease enter a valid Member Id");
        else
            this.memberId = memberId;
    }

    void getMemberId(){
        System.out.println(memberId);
    }

    void setMemberName(String memberName){
        int i=0;
        boolean flag = true;
        while(i<memberName.length()){
            if(Character.isDigit(memberName.charAt(i))){
                flag = false;
                break;
            }
            i++;
        }
        if(flag)
            this.memberName = memberName;
        else
            System.out.println("Digits are not allowed in the name !");
    }

    void getMemberName(){
        System.out.println(memberName);
    }

    void setMaxBookAllowed(int maxBookAllowed){
        if(maxBookAllowed > 0 && maxBookAllowed <= 10)
            this.maxBookAllowed = maxBookAllowed;
        else
            System.out.println("\nMaximum books allowed is 10  \nMinimum books allowed is 1");
    }

    int getMaxBookAllowed(){
        return maxBookAllowed;
    }

    Member(int memberId, String memberName, int maxBookAllowed, int loanPeriodDays){
        setMemberID(memberId);
        setMemberName(memberName);
        setMaxBookAllowed(maxBookAllowed);
        setLoanPeriodDays(loanPeriodDays);
    }
}