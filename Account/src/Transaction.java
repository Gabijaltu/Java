import java.util.Date;

public class Transaction  {

    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
