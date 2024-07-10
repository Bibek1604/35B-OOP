
import java.util.Scanner;

/*create bank account class to stimulate a Bank account .the class should have the follwoing attibute;
 account number,account holder name,and balance\include methods is deposit(),withdrwa and checkbalance() implement functionlaity to
 create new account
 depost money into account
 withdraw money
 checkthe account balance  */

public class bnk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the acoount numebr:");
        int account_number = scanner.nextInt();
        
        System.out.println("Enter the accout holder name: ");
        String account_holder = scanner.nextLine();
        
        scanner.nextLine();
        

        System.out.println("Enter the balance: ");
        int balance = scanner.nextInt();


        BankAccount account= new BankAccount(account_number, account_holder, balance);

        System.out.println("enter the amount to deposit: ");
        int deposit = scanner.nextInt();
        account.deposit(deposit);

        System.out.println("Enter the the balance after withdraw: ");
        int withdraw = scanner.nextInt();
        account.withdraw(withdraw);

        
        account.checkbalance();      
        scanner.close();

    }
    
}
class BankAccount{
    public int account_number ;
    public String account_holder ;
    public int balance;

    public BankAccount(int account_number , String account_holder  ,int balance){
        this.account_holder = account_holder;
        this.account_number=account_number;
        this.balance = balance;
    }
    
    public void deposit(int amount){
        if(amount >0){
            balance = balance+amount;
            System.out.println("deposited amount is :"+balance);
        }else{
            System.out.println("balance must be positice");
        }

    }
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Updated balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Amount must be positive to withdraw.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }














    
        

    
    public int checkbalance(){
        return balance;

    }
     
}
