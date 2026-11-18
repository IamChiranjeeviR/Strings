public class CurrentAccount extends Account {

    private static final double OVERDRAFT = -1000;

    private CurrentAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }

    protected static CurrentAccount createAccount(int accountNumber, String accountHolder, double balance){
        return new CurrentAccount(accountNumber, accountHolder, balance);
    }

    @Override
    protected boolean canWithdraw(double amount){
        return getBalance() - amount >= OVERDRAFT;
    }

}
