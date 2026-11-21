package project;
class SavingsAccount extends Account {

    private static final double MINIMUM_BALANCE = 500.0;

    private SavingsAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber,accountHolder,balance);
    }

    public static SavingsAccount createAccount(int accountNumber, String accountHolder, double balance){
        if(balance < MINIMUM_BALANCE)
            throw new IllegalArgumentException("Minimum balance should be: "+ MINIMUM_BALANCE);

        return new SavingsAccount(accountNumber, accountHolder, balance);
    }

    @Override 
    protected boolean canWithdraw(double amount){
        return getBalance() - amount >= MINIMUM_BALANCE;
    }

}
