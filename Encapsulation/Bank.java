
import java.util.Scanner;

// You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation
//  principles in mind. Include private instance variables for the account number, account holder name, and account balance.
//   Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. 
//   Ensure that the account balance cannot be accessed or modified directly.




public class Bank {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number:");
        int number = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline left behind by nextInt()
        
        System.out.println("Enter the account holder:");
        String accountHolder = scanner.nextLine();
        
        System.out.println("Enter the initial balance:");
        int accountBalance = scanner.nextInt();
        
        bankaccount account = new bankaccount(number, accountHolder, accountBalance);

        
        account.deposit(200);
        System.out.println("New balance after deposit: " + account.getaccountbalance());
        
        account.withdraw(100);
        System.out.println("New balance after withdraw: " + account.getaccountbalance());
    
        scanner.close();
    }

    
}

class bankaccount{
    private String accountholder ;
    private int number;
    private int accountbalance;
    


    public bankaccount(int number, String accountholder, int accountbalance){

        this.accountholder=accountholder;
        this.accountbalance=accountbalance;
        this.number=number;

    }
    public void deposit(double deposit){
        accountbalance+=deposit;
    }

    public void withdraw(double withdraw){
        if (withdraw > accountbalance) {
            System.out.println("WIthdraw amount is greater");
            
        }else{
            this.accountbalance-=withdraw;

        }

    }
    public double getaccountbalance(){
        return accountbalance;
    }

}


