package practice;

abstract class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    Account(int accountNumber, String accountHolderName, double balance){
        if(validateData(accountNumber, accountHolderName, balance)){
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;

            System.out.println("Account created successfully");
        }
    }

    private boolean validateData(int accountNumber, String accountHolderName, double balance){

        if(accountNumber <= 0){
            System.out.println("Invalid Account Number");
            return false;
        }

        if(accountHolderName == null || accountHolderName.trim().isEmpty()){
            System.out.println("Invalid Account Holder name");
            return false;
        }

        if(isNegative(balance)) return false;

        return true;
    }

    protected boolean isNegative(double amount){
        if(amount < 0){
            System.out.println("Balance should not be negative");
            return true;
        }
        return false;
    }

    public void deposit(double amount){
        if(!isNegative(amount)){
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(!isNegative(amount)){
            if(amount < balance){
                this.balance -= amount;
            }
            else{
                System.out.println("Unable to withdraw");
            }
        }
    }

    double getBalance(){
        return balance;
    }

    void setBalance(double amount){
       this.balance -= amount; 
    }
}
