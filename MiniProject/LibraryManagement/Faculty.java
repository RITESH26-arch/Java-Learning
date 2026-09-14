public class Faculty extends Member{
    private double fine;
    private int issueDate,daysOverDue,bookSubmittingDate,noOfBooks=0;
    private String departmentName,designation,month,bookName; 

    void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    void setDesignation(String designation){
        this.designation = designation;
    }

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
        this.daysOverDue = this.issueDate + 10;
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

    Faculty(int memberId,String memberName,String departmentName,String designation,int issueDate,int bookSubmittingDate,String month,String bookName){
        super(memberId,memberName);
        setDepartmentName(departmentName);
        setDesignation(designation);
        setIssueDate(issueDate);
        setBookSubmittingDate(bookSubmittingDate);
        setMonth(month);
        setBookName(bookName);
    }

    @Override 
    double calculateFine(){
            if(bookSubmittingDate > daysOverDue){
            int fineDays = bookSubmittingDate - daysOverDue;
            this.fine = fineDays * 0.5;
            }
            else
                System.out.print("\nNo Fine !");    
        return fine;
    }

    @Override
    int maxBookAllowed(){
        int maxBookAllowed = 10;
        return maxBookAllowed;
    }

    @Override 
    public void displayMemberInfo(){
        super.displayMemberInfo();
        System.out.println("\nDepartment => " + departmentName + "\nDesignation => " + designation + "\nBook Name => " + bookName + "\nNo.of Books => " + noOfBooks + 
        "\nMax Books allowed to issue => " + maxBookAllowed() + " Books" +
        "\nBook issued date => " + issueDate + "\nBook return due date => " + daysOverDue + 
        "\nBook returning date => " 
        + bookSubmittingDate + "\nFine => " + fine + "Rs" + "\nMonth => " + month);
    }
}