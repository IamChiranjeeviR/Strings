package project;
class Main{
    public static void main(String[] args) {
       Bank sbi = new Bank();
       sbi.addCustomer(101, "Chiranjeevi");
       sbi.addCustomer(102, "Jyothi");
       sbi.addCustomer(103, "Shabeera");
       sbi.addCustomer(104, "Ram");

        Customer customer = sbi.getCustomer(103);
        
        customer.addAccount(SavingsAccount.createAccount(1001, customer.getCustomerName(), 500));

        customer.displayAccounts();

    }
}