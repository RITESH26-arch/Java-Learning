public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    void setAccountNumber(String  accountNumber){
        if(accountNumber.length()>10){
            System.out.println("INVALID ACCOUNT NUMBER !!\nAccount Number should be less than 10 digits !\n");
        }
        else{
            this.accountNumber = accountNumber;
        }
    }

    void setBalance(double balance){
        if(balance<=0){
            System.out.println(balance +" Invalid Balance !!\n");
        }
        else{
            this.balance = balance;
        }
    }

    public BankAccount(String accountNumber,double balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
}
