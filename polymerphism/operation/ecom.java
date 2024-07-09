
// You are working on an e-commerce application where different payment methods are supported, including credit card, PayPal, and bank transfer. 
// Each payment method has its own validation and transaction process. Implement a Java program using polymorphism to process 
// payments using different payment methods.
public class ecom {
    public static void main(String[] args) {

        Card cd = new Card();
        cd.payment();

        paypal pl = new paypal();
        pl.payment();

        BankTransfer bt = new BankTransfer();
        bt.payment();
        
    }
    
}

interface Paymentmethod{
    public void payment();
}

class Card implements  Paymentmethod{

    @Override
    public void payment(){
        System.out.println("here it shows the card details");
    }
}

class paypal implements Paymentmethod{
    @Override

    public void payment(){
        System.out.println("It shows the details of paypal");
    }
}

class BankTransfer implements Paymentmethod{

    @Override
    public void payment(){
        System.out.println("It shows the bank transfer details");
    }
}