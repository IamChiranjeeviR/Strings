package practice;

public class SavingsAccount extends Account {
    public static final double MINIMUM_BALANCE = 500;

    private SavingsAccount(int accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    public static SavingsAccount createAccount(int accountNumber, String accountHolderName, double balance){

        if(balance < MINIMUM_BALANCE) return null;
        
        return new SavingsAccount(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount){
        double currentBalance = getBalance();
        if(!isNegative(amount)){
            if(currentBalance - amount >= MINIMUM_BALANCE){
                setBalance(amount);
            }
            else{
                System.out.println("Unable to withdraw");
            }
        }
    }

}
