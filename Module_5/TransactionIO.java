package Module_5;

import java.util.ArrayList;
import java.util.Date;

public class TransactionIO {


     
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Transaction> transactions;
    
    public void Account() {
            id = 0;
            balance = 0;
            annualInterestRate = 0;
            dateCreated = new Date();
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public double getBalance() {
            return balance;
    }

    public void setBalance(double balance) {
            this.balance = balance;
    }

    public double getAnnualInterestRate() {
            return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
            return dateCreated;
    }

    public double getMonthlyInterestRate() {
            return annualInterestRate/ 12.0;
    }
    public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double a) {
            balance = balance - a;
            transactions.add(new Transaction(new Date(), 'W', a, balance, "Deposit"));
    }
    
    public void deposit(double a) {
            balance = balance + a;
            transactions.add(new Transaction(new Date(), 'D', a, balance, "Deposit"));
    }

    @Override
    public String toString() {
            return "Account [\nid: " + id + "\nbalance: " + balance + "\nannualInterestRate: " + annualInterestRate
                            + "\ndateCreated: " + dateCreated + "]";
    }
    
}
