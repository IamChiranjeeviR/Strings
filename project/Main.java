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

        Account account = customer.findAccount(1001);

        account.deposit(3000);
        account.withdraw(200);
        account.withdraw(300);

        account.printTransactionHistory();

    }
}