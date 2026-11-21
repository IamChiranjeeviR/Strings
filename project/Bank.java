package project;

import java.util.ArrayList;

public class Bank {
    private static final String BANK_NAME = "SBI";
    private ArrayList<Customer> customers;

    public Bank(){
        this.customers = new ArrayList<>();
    }

    public void addCustomer(int customerId, String customerName){
        customers.add(Customer.createCustomer(customerId, customerName));
    }

    public void displayCustomers(){
        for(Customer customer: customers){
            System.out.println(customer + "\n");
        }
    }

    public Customer getCustomer(int customerId){
        for(Customer customer: customers){
            if(customer.getCustomerId() == customerId)
            return customer;
        }

        return null;
    }

    
}
