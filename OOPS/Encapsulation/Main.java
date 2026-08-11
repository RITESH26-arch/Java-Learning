public class Main {
    public static void main(String[] args){
       /*  this is the basic way to set values using setter and get value using getter
       
        BankAccount b2 = new BankAccount();
        b1.setAccountNumber("9834332036");
        b1.setBalance(-2000);
        String accountNumber = b1.getAccountNumber();
        double balance = b1.getBalance();
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);


        */


        BankAccount b1 = new BankAccount("009307186470",300);
        String accountNumber1 = b1.getAccountNumber();
        double balance1 = b1.getBalance();
        System.out.println("Account Number : " + accountNumber1);
        System.out.println("Balance : " + balance1);

        BankAccount b2 = new BankAccount("9307186470",-300);
        String accountNumber2 = b2.getAccountNumber();
        double balance2 = b2.getBalance();
        System.out.println("Account Number : " + accountNumber2);
        System.out.println("Balance : " + balance2);

        
    }
}
