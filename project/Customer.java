package project;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private List<Account> accounts;

    private Customer(int customerId, String customerName){

        validateCustomerDetails(customerId, customerName);

        this.customerId = customerId;
        this.customerName = customerName;
        this.accounts = new ArrayList<>();

        System.out.println("Customer created Successfully");
    }

    private void validateCustomerDetails(int customerId, String customerName){

        if(customerId < 0) 
            throw new IllegalArgumentException("Invalid Customer ID");

        if(customerName == null || customerName.trim().isEmpty()) 
            throw new IllegalArgumentException("Invalid customer name");
    }

    public static Customer createCustomer(int customerId, String customerName){
        return new Customer(customerId, customerName);
    }

    public void addAccount(Account account){
        if(account == null) 
            throw new IllegalArgumentException("Invalid Account");

        accounts.add(account);
    }

    public void displayAccounts(){
        for(Account account: accounts){
            System.out.println(account + "\n");
        }
    }

    public String getCustomerName(){
        return customerName;
    }

    public Account findAccount(int accountNumber){

        for(Account account: accounts){
            if(account.getAccountNumber() == accountNumber)
            return account;
        }

        return null;
    }

    public int getCustomerId(){
        return customerId;
    }

    @Override 
    public String toString(){
        return "Customer ID: " + customerId + "\n" + "Name: " + customerName;
    }


}
