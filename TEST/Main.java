// * Question Design and implement a java program that simulates a financial transaction system
// * Your system should be capable of processing different types of transaction,
// * such as deposits and withdrawls, and alerting if any transaction exceed certain limits.
// * Use interfaces to define common behaviours for transaction and implement these 
// * behaviours in different transaction classes.
// * 
// * Create an interface named Transaction with atleast two methods:
// * - getAmount() which returns the amount of the transaction as double
// * - isValid() which returns a boolean indicating if the transaction is valid based on certain citeria
// * 
// * Implement the Transaction interface in at least three seperate classes, DepositeTransaction and WithdrawalTransaction.
// * Each class should have a constructor that sets a limit for transaction and specific logic to determine if the transaction is valid
// */

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);


            System.out.print("Enter deposit limit: ");
            double depositLimit = scanner.nextDouble();
    
            System.out.print("Enter withdrawal limit: ");
            double withdrawalLimit = scanner.nextDouble();
    
            System.out.print("Enter amount for the first deposit: ");
            double depositAmount1 = scanner.nextDouble();
            Transaction deposit1 = new DepositTransaction(depositAmount1, depositLimit);
    
            System.out.print("Enter amount for the first withdrawal: ");
            double withdrawalAmount1 = scanner.nextDouble();
            Transaction withdrawal1 = new WithdrawalTransaction(withdrawalAmount1, withdrawalLimit);
    
            processTransaction(deposit1);
            processTransaction(withdrawal1);


    
            scanner.close();
        }
    
        public static void processTransaction(Transaction transaction) {
            if (transaction.isValid()) {
                System.out.println("Transaction of amount " + transaction.getAmount() + " is valid and processed.");
            } else {
                System.out.println("Transaction of amount " + transaction.getAmount() + " exceeds the limit and is not processed.");
            }
        }
    }

        
    

interface Transaction {
    double getAmount();
    boolean isValid();
}
class DepositTransaction implements Transaction {
    private double amount;
    private double limit;

    public DepositTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}
class WithdrawalTransaction implements Transaction {
    private double amount;
    private double limit;

    public WithdrawalTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}
