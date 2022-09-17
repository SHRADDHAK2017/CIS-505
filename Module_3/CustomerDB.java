package Module_3;

public class CustomerDB {
    public static Customer getCustomer(int customerID){
        Customer customer = new Customer();
        if(customerID == 1000)
            customer = new Customer("John Juno", "11267 S 114th Ave", "Papillon", "68046");
        else if(customerID == 1001)
            customer = new Customer("Kerry Ann ", "5729 N 98th Plaza", "Wesley Chapel", "55435");
        else if(customerID == 1002)
            customer = new Customer("Peter Kim", "4529 Crabapple Drive", "Zephyrhills", "55103");
        else
            customer = new Customer();
        return customer;
    }
}
