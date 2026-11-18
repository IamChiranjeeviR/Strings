abstract class Account{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    //Constructor
    protected Account(int accountNumber, String accountHolder, double balance){
        validateAccountDetails(accountNumber, accountHolder, balance);

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    private void validateAccountDetails(int accountNumber, String accountHolder, double balance){
        if(accountNumber <= 0 )
            throw new IllegalArgumentException("Invalid Account Number");

        if(accountHolder == null || accountHolder.trim().isEmpty())
            throw new IllegalArgumentException("Invalid Name");
         
        validateAmount(balance);
        
    }

    private void validateAmount(double amt){
        if(amt < 0)
            throw new IllegalArgumentException("Invalid Balance");
    }

    //withdraw
    public void withdraw(double amt){
        validateAmount(amt);
            
        if(canWithdraw(amt))
            this.balance -= amt;
        else
            throw new IllegalStateException("Insufficient funds");
    }

    protected abstract boolean canWithdraw(double amount);

    //deposit
    public void deposit(double amt){
        validateAmount(amt);
        this.balance += amt;
    }

    protected double getBalance(){
        return balance;
    }

    public void getAccountDetails(){
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }

}