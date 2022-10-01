package Module_5;

public class ValidatorIO {
    

    
    public static void main(String[] args) {
                
        TransactionIO acc = new TransactionIO();
        acc.setAnnualInterestRate(4.5);
        acc.setBalance(20000);
        acc.setId(1122);

        System.out.println(acc);
        System.out.println();
        
        acc.withdraw(2500);
        System.out.println(acc);
        System.out.println();
        
        acc.deposit(3000);
        System.out.println(acc);
        System.out.println();
}
}
