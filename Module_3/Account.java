package Module_3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private double balance;
    private static double minBalance = 200;
    char answer;
    char option = '\0';
        Scanner scanner = new Scanner(System.in);

    public Account(){
        balance = minBalance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
        }
        else{
            System.out.println("Error: Insufficient funds");
        }
    }

    public void displayMenu(){
        

        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Exit");
        do {
            System.out.println("=======================================");
            System.out.println("Enter an option");
            System.out.println("=======================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("---------------------------------------");
                    System.out.println("Balance = " + getBalance());
                    System.out.println("---------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("---------------------------------------");
                    System.out.print("Enter an amount to deposit: ");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("---------------------------------------");
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("---------------------------------------");
                    System.out.print("Enter an amount to withdraw: ");
                    double amount2 = scanner.nextDouble();
                    withdraw(amount2);
                    System.out.println("---------------------------------------");
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("=======================================");
                    System.out.println("Thank you for using our services");
                    System.out.println("=======================================");
                    break;

                default:
                    System.out.println("Error: Invalid Option!!!");
                    break;                    
            }
            
            System.out.println("Do you want to continue? Y|N");
            answer = scanner.next().charAt(0);
        } 
        while(answer == 'Y' |answer == 'y');
            
    }
        
    public String getTransactionDate(){
        Date date = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM-dd-yyyy");
        return dateForm.format(date);
    }
}
