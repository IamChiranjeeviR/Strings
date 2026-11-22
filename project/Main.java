package project;
class Main{
    public static void main(String[] args) {
       Bank sbi = new Bank();
       sbi.addCustomer(101, "Chiranjeevi");
       sbi.addCustomer(102, "Jyothi");
       sbi.addCustomer(103, "Shabeera");
       sbi.addCustomer(104, "Ram");

        Customer customer = sbi.getCustomer(103);
        
        customer.addAccount(SavingsAccount.createAccount(1001, customer.getCustomerName(), 3000));

        customer.addAccount(CurrentAccount.createAccount(1002, customer.getCustomerName(), 500));

        Account account1 = customer.findAccount(1001);
        Account account2 = customer.findAccount(1002);

        account1.transfer(account2, 823);

        customer.displayAccounts();

        // account.printTransactionHistory();

    }
}