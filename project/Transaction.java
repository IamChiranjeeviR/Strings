
import java.time.LocalDateTime;

public class Transaction {
    private final TransactionType type;
    private final double amount;
    private final LocalDateTime timestamp;

    public Transaction(TransactionType type, double amount){
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override 
    public String toString(){
        return "Type: " + type + "\n" + "Amount: " + amount + "\n" + timestamp;
    }
}
