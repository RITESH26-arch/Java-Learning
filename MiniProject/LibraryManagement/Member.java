abstract class Member {
    private int memberId,maxBookAllowed;
    private String memberName;

    abstract double calculateFine();
    

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

    void setMaxBookAllowed(int maxBookAllowed){
        if(maxBookAllowed > 0 && maxBookAllowed <= 10)
            this.maxBookAllowed = maxBookAllowed;
        else
             System.out.println("\nMaximum books allowed is 10  \nMinimum books allowed is 1");
    }

    int getMaxBookAllowed(){
        return maxBookAllowed;
    }

    Member(int memberId,String memberName,int maxBookAllowed){
        setMemberID(memberId);
        setMemberName(memberName);
        setMaxBookAllowed(maxBookAllowed);
    }
    
}
