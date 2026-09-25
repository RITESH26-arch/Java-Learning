public class Faculty extends Member {
    private String departmentName, designation;

    void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    void setDesignation(String designation){
        this.designation = designation;
    }

    Faculty(int memberId, String memberName, String departmentName, String designation,
            int issueDate, int bookSubmittingDate, String month, String bookName){
        super(memberId, memberName, 10, 10);
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
        else{
            this.fine = 0.0;
            System.out.print("\nNo Fine !");
        }
        return fine;
    }

    @Override
    public void displayMemberInfo(){
        super.displayMemberInfo();
        System.out.println("\nDepartment => " + departmentName + "\nDesignation => " + designation);
    }
}