
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static final String BANK_NAME = "SBI";
    private Map<Integer,Customer> customers;

    public Bank(){
        this.customers = new HashMap<>();
    }

    public void addCustomer(int customerId, String customerName){
        if(customers.containsKey(customerId)){
            throw new IllegalArgumentException("Customer Already Exists");
        }
        
        customers.put(
            customerId,
            Customer.createCustomer(customerId, customerName)
        );
    }


    public Customer getCustomer(int customerId){
        return customers.get(customerId);
    }

    public void saveCustomers(){
        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter("data/CustomersData.csv"));

            for(Customer customer: customers.values()){
                writer.write(customer.toString());
                writer.newLine();
            }

            writer.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    
}
