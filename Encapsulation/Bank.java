
import java.util.Scanner;

// You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation
//  principles in mind. Include private instance variables for the account number, account holder name, and account balance.
//   Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. 
//   Ensure that the account balance cannot be accessed or modified directly.




public class Bank {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number= scanner.nextInt();

        System.out.println("Enter the accountholder");
        int accountbalance = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the accountholdeer: ");
        String accountholder = scanner.nextLine();



        bankaccount ba = new bankaccount();
        ba.setaccountholder(accountholder);
        ba.setaccountbalance(accountbalance);
        ba.setnumber(number);
    }

    
}

class bankaccount{
    private String accountholder ;
    private int number;
    private int accountbalance;
    


    public String getaccountholder(){
        return this.accountholder;
    }

    public void setaccountholder(String h){
        this.accountholder = h;
    }
    public int getnumber(){
        return this.number;
    }
    public void setnumber(int n){
        this. number = n;
    }
    public int getaccountbalance(){
        return this.accountbalance;
    }
    public void setaccountbalance(int b){
        this.accountbalance = b;
    }
    public void deposit(double amount){
        this.accountbalance+=amount;
    }
    public void withdraw(double withdraw){
        if (withdraw > accountbalance) {
            System.out.println("WIthdraw amount is greater");
            
        }else{
            this.accountbalance-=withdraw;

        }

    }

}


