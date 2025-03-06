import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public Account(){
        dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return String.valueOf(dateCreated);
    }

    public void setId(int id) {
        this.id = id;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount){
        balance = balance - amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw"));
    }

    public void deposit(double amount) {
        balance = balance + amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
