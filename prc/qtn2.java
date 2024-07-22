 /*
 * Create a BankAccount class to simulate a bank account. 
 * The class should have the following attributes: account number, account holder name, and balance.
 * include methods to deposit(), withdraw(), and checkBalane()
 * Implement functionality to:
 * -Create new accounts
 * -Deposits money into the accounts
 * -Withdraw money
 * -Check the account balance
 */


public class qtn2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100, "NishanBista ", 200);
        b1.checkBalane();
        
    }
    
}

class BankAccount{
    private int accno;
    private String accname;
    private int balance;

    BankAccount(int accno,String accname, int balance){
        this.accno = accno;
        this.accname = accname;  
        this.balance = balance;
    }
     

    public int getaccno(){
        return accno;

    }
    public void setaccno(int accno){
        this.accno=accno;
    }
    
    public String accname() {
        return accname;
    }
    public void setaccname(String accname){
        this.accname=accname;
    }
    
    public int getbalance() {
        return balance;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public void Withdraw(int amount){
        balance=balance-amount;
    }
    public void checkBalane(){
        System.out.println("balance is"+this.balance);

    }


}
