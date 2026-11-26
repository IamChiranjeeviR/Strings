public class CurrentAccount extends Account {

    private static final double OVERDRAFT = -1000;

    private CurrentAccount(int accountNumber,int customerId, String accountHolder, double balance){
        super(accountNumber, customerId, accountHolder, balance);
    }

    public static CurrentAccount createAccount(int accountNumber, int customerId, String accountHolder, double balance){
        return new CurrentAccount(accountNumber, customerId, accountHolder, balance);
    }

    @Override
    protected boolean canWithdraw(double amount){
        return getBalance() - amount >= OVERDRAFT;
    }

}
