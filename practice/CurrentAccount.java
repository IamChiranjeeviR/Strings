package practice;

public class CurrentAccount extends Account {
    public static final double OVERDRAFT = -1000;

    private CurrentAccount(int accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    public static CurrentAccount createAccount(int accountNumber, String accountHolderName, double balance){
        return new CurrentAccount(accountNumber, accountHolderName, balance);
    }


    @Override
    public void withdraw(double amount){
        double currentBalance = getBalance();

        if(!isNegative(amount)){
            if(currentBalance - amount >= OVERDRAFT) {
                setBalance(amount);
            }
            else{
                System.out.println("You cannot withdraw");
            }
        }
    }
}
