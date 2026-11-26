
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private List<Account> accounts;

    public Customer(int customerId, String customerName){

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
       Helper.printList(accounts);
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
        return customerId + "," + customerName;
    }

    @Override 
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        Customer other = (Customer) obj;

        return customerId == other.customerId;
    }

    public void saveAccounts(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/AccountsData.csv"));

            for(Account account : accounts){
                writer.write(account.toString());
                writer.newLine();
            }
            
            writer.close();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override 
    public int hashCode(){
        return Integer.hashCode(customerId);
    }

}
