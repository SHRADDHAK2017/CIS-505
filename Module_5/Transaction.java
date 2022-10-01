package Module_5;

import java.util.Date;

public class Transaction {

    private Date date;
                public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
                private char type;
                public char getType() {
                    return type;
                }
                public void setType(char type) {
                    this.type = type;
                }
                private double amount;
                public double getAmount() {
                    return amount;
                }
                public void setAmount(double amount) {
                    this.amount = amount;
                }
                private double balance;
                public double getBalance() {
                    return balance;
                }
                public void setBalance(double balance) {
                    this.balance = balance;
                }
                private String description;
                public String getDescription() {
                    return description;
                }
                public void setDescription(String description) {
                    this.description = description;
                }
                public Transaction(Date date, char type, double amount, double balance, String description) {
                        this.date = date;
                        this.type = type;
                        this.amount = amount;
                        this.balance = balance;
                        this.description = description;
                }
    
}
