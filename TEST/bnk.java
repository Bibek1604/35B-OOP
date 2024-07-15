
import java.util.Scanner;

/* Create a bankaccount class to stimulate a bank account.this class hsould have following attrutes:accountnumber,accountholdername,
 * account holdername and balance. include method to ddeposit(),withdraw(),checkbalance().implement unctionality
 * 
 * create new account
 * deposit money into the account   
 * withdraw money
 * check the account balance
 */



public class bnk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number: ");
        int accountnumber = scanner.nextInt();

        System.out.println("Enter the account holder name : ");
        String accoutholdername = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Enter the balanace: ");
        int balanace = scanner.nextInt();





        bankaccount account = new bankaccount(accountnumber, accoutholdername, balanace);
        System.out.print("Enter the amount to deposit: ");
        int depositamt = scanner.nextInt();
        account.deposit(depositamt);
        
        System.out.println("Enter the amount to withdraw: ");
        int withdrawamt = scanner.nextInt();
        account.withdraw(withdrawamt);
        
        account.checkBalance();
        System.out.println("Account Number: " + account.getaccountnumber());
        System.out.println("Account Holder Name: " + account.getaccountholdername());
        System.out.println("Final Balance: " + account.getbalance());
        
        scanner.close();
    



        


        
    }
}
class bankaccount{
    public int accountnumber;
    public String accoutholdername;
    public int balance;

    public bankaccount(int accountnumber , String accountholdername , int balance){
        this.accountnumber = accountnumber;
        this.accoutholdername=accountholdername;
        this.balance=balance;
    }

    

    public int deposit(int amount){
        if (amount >0){
            balance=  balance+amount;
        }
        else{
            System.out.println("your ammount must be greate than 0");
        }
        return amount;

    }
    public int withdraw(int amount){
        if(amount > 0 && amount < balance){
            balance=balance-amount;
        }else{
            System.out.println("Error detection");
        }
        return amount;
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public int getaccountnumber(){
        return accountnumber;
    }
    public String getaccountholdername(){
        return accoutholdername;
    }

    public int getbalance(){
        return balance;
    }
}