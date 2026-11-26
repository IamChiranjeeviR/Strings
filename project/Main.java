import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) {

        Bank sbi = new Bank();
        sbi.addCustomer(101, "Chiru");

        sbi.saveCustomers();

        Customer customer1 = sbi.getCustomer(101);

        customer1.addAccount(SavingsAccount.createAccount(1001, customer1.getCustomerId(), customer1.getCustomerName(),500));

        customer1.addAccount(CurrentAccount.createAccount(1002, customer1.getCustomerId(), customer1.getCustomerName(),50000));

        customer1.saveAccounts();
    }
}