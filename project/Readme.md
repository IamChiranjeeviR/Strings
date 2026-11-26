✅ Classes & Objects
✅ Constructors
✅ Encapsulation
✅ Validation
✅ Inheritance
✅ Constructor Chaining
✅ Static Factory Method
✅ Abstraction
✅ Abstract Methods
✅ Open Closed Principle
✅ Method Overriding
✅ Runtime Polymorphism
✅ Dynamic Method Dispatch
✅ Early Binding
✅ Late Binding
✅ Upcasting

find . -type f -name "*.class" -delete



Arrays:
   101      102       103
["Chiru", "Jyothi", "Shabeera"]


ArrayList: Insertion and Deletion are expensive
(data access is fast)

   101      102       103
["Chiru", "Jyothi", "Shabeera"]

["Chiru", "Jyothi", "Shabeera","Rasheed"]

["Chiru", "Ram", "Jyothi", "Shabeera","Rasheed"]


Linked List:

  101        444         0032
"Chiru" <- "Jyothi" <- "Shabeera"

"Ram"

List 
ArrayList and Linkedlist


        // List<Account> accounts = new ArrayList<>();

        // accounts.add(SavingsAccount.createAccount(1001, "Chiru", 500));

        // accounts.add(CurrentAccount.createAccount(1002, "Shabeera", 500));

        // Account acc1 = accounts.get(0);

        // acc1.deposit(100);
        // acc1.withdraw(10);
        // acc1.withdraw(88);

        // List<Transaction> transactions = acc1.getList();

        // Helper.printList(accounts);
        // Helper.printList(transactions);

        
        // try{
        //     FileWriter writer = new FileWriter("Sample.txt");
        //     writer.write("This is a normal text");
        //     writer.close();

        //     FileReader reader = new FileReader("Sample.txt");

        //     int character;

        //     while((character = reader.read()) != -1){
        //         System.out.print((char) character);
        //     }

        // }catch(IOException e){
        //     System.out.println(e);
        // }

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Sample.txt"));

            writer.write("Hello Java");
            writer.newLine();
            writer.write("This is a sample file handling code");
            

            writer.close();


        }catch(IOException e){
            System.out.println(e);
        }