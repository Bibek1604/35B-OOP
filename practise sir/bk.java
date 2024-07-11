
import java.util.Scanner;

/*create bank account class to stimulate a Bank account .the class should have the follwoing attibute;
 account number,account holder name,and balance\include methods is deposit(),withdrwa and checkbalance() implement functionlaity to
 create new account
 depost money into account
 withdraw money
 checkthe account balance  */

 public class bk{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account numebr : ");
        int accountnbr = scanner.nextInt();

        System.out.println("Enter account holdername: ");
        String acchldr = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Enter current balance: ");
        int blnc = scanner.nextInt();

        Bankaccount bn = new Bankaccount(accountnbr, acchldr, blnc);


        System.out.println("Enter money to deposit: ");
        int deposit = scanner.nextInt();
        bn.deposit(deposit);

        System.out.println("enter moneyt to withdrwa");
        int withdraw = scanner.nextInt();

        bn.withdraw(withdraw);

        bn.checkbalance();

        scanner.close();
    
        
    }
 }


class Bankaccount{
    public int accountnbr ;
    public String acchldr;
    public int blnc;

    Bankaccount(int accountnbr,String acchldr , int blnc) {
        this.accountnbr=accountnbr;
        this.acchldr=acchldr;
        this.blnc= blnc;
    }

    public void deposit(int amnt){
        if (amnt>0){
            blnc=amnt+blnc;
            System.out.println("ammount is "+blnc);

        }else{
            System.out.println("amount must be positive");
        }
    }
    public void withdraw(int amnt){
        if (amnt>0 && amnt<=blnc){
            blnc = blnc-amnt;
            System.out.println("Withdraw money"+amnt);  
            System.out.println("total money:"+blnc);
        }else if(amnt<=0){
            System.out.println("money most be positive");
        }else{
            System.out.println("unsuccessful");
        }
    }
    public int checkbalance(){
        return blnc;
    }

}