package Module_3;

import java.util.Scanner;

public class TestCustomerAccountApp {
    
    public static void main(String[] args) {
        int customerID = 0;
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        Account account = new Account();
        System.out.println("Enter a customer ID: ");
        customerID = scanner.nextInt();
        customer = CustomerDB.getCustomer(customerID);
        System.out.println("Customer: " + customer.toString());
        account.displayMenu();
        System.out.println("Customer's balance: " + account.getBalance());
        System.out.println("Transactions completed today: " + account.getTransactionDate());
    
        scanner.close();
    }

  
}
