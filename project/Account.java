
import java.util.ArrayList;
import java.util.List;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidAccountException;
import exceptions.InvalidNameException;

abstract class Account{
    private int accountNumber;
    private int customerId;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactions;

    //Constructor
    protected Account(int accountNumber, int customerId, String accountHolder, double balance){
        validateAccountDetails(accountNumber, accountHolder, balance);

        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }


    private void validateAccountDetails(int accountNumber, String accountHolder, double balance){
        if(accountNumber <= 0 )
            throw new InvalidAccountException("Invalid Account Number");

        if(accountHolder == null || accountHolder.trim().isEmpty())
            throw new InvalidNameException("Invalid Name");
         
        validateAmount(balance);
        
    }

    List<Transaction> getList(){
        return transactions;
    }

    private void validateAmount(double amt){
        if(amt < 0)
            throw new IllegalArgumentException("Balance should not be less than 0");
    }

    //withdraw
    public void withdraw(double amt){
        validateAmount(amt);
            
        if(canWithdraw(amt)){
            this.balance -= amt;
            transactions.add(new Transaction(TransactionType.WITHDRAW, amt));
        }
        else
            throw new InsufficientBalanceException("Insufficient funds");
    }

    protected abstract boolean canWithdraw(double amount);

    //deposit
    public void deposit(double amt){
        validateAmount(amt);
        this.balance += amt;

        transactions.add(new Transaction(TransactionType.DEPOSIT,amt));
    }

    public void transfer(Account destinationAccount, double amount){

        if(destinationAccount == null)
            throw new InvalidAccountException("Destination account cannot be null");

        withdraw(amount);
        destinationAccount.deposit(amount);
    }

    protected double getBalance(){
        return balance;
    }

    public void getAccountDetails(){
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void printTransactionHistory(){
        Helper.printList(transactions);
    }


    @Override
    public String toString() {
        return accountNumber + "," + customerId + "," + accountHolder + "," + balance;
    }
}