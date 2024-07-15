public class FinancialTransactionSystem {

    public static void main(String[] args) {
        double depositLimit = 1000.00;
        double withdrawalLimit = 2000.00;

        transaction deposit = new DepositeTransaction(1100.0, depositLimit);
        transaction withdraw = new WithdrawalTransaction(2000.0, withdrawalLimit);

        processTransaction(deposit);
        processTransaction(withdraw);
    }

    public static void processTransaction(transaction transaction) {
        if (transaction.isValid()) {
            System.out.println("Transaction of amount " + transaction.getAmount() + " is valid and processed.");
        } else {
            System.out.println("Transaction of amount " + transaction.getAmount() + " exceeds the limit and is not processed.");
        }
    }
}

interface transaction {
    double getAmount();
    boolean isValid();
}

class DepositeTransaction implements transaction {
    private double amount;
    private double limit;

    DepositeTransaction(double amount, double limit) {
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

class WithdrawalTransaction implements transaction {
    private double amount;
    private double limit;

    WithdrawalTransaction(double amount, double limit) {
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
