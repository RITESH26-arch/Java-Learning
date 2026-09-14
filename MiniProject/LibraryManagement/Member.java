abstract class Member {
    private int memberId;
    private String memberName;

    abstract double calculateFine();
    abstract int maxBookAllowed();

    void displayMemberInfo(){
        System.out.println("\nMember Id => " + memberId + "\nMember Name => " + memberName);
    }

    void setMemberID(int memberId){
        if(memberId <= 0){
            System.out.println("Invalid Member Id !! \nPlease enter a valid Member Id");
        }
        else{
            this.memberId = memberId;
        }
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
            else{
                i++;
            }
        }
        if(flag==true){
                this.memberName = memberName;
            }
            else{
                System.out.println("Digits are not allowed in the name !");
            }
    }

    void getMemberName(){
        System.out.println(memberName);
    }

    Member(int memberId,String memberName){
        setMemberID(memberId);
        setMemberName(memberName);
    }
    
}
