///student profile

public class Student {
    public String studentID;public class BankAccount {
    private double balance;  // Private variable to protect direct access

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Create an account with an initial balance
        account.deposit(500);  // Deposit money
        account.withdraw(200);  // Withdraw money
        System.out.println("Current Balance: " + account.getBalance());  // Display the balance
    }
}
public class BankAccount {
    private double balance;  // Private variable to protect direct access

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Create an account with an initial balance
        account.deposit(500);  // Deposit money
        account.withdraw(200);  // Withdraw money
        System.out.println("Current Balance: " + account.getBalance());  // Display the balance
    }
}

    public String name;
    public double GPA;

    public Student(String studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public void updateGPA(double newGPA) {
        this.GPA = newGPA;
    }

    public void printProfile() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        Student student1 = new Student("S001", "John Doe", 3.5);
        student1.printProfile();
        
        student1.updateGPA(3.8);
        student1.printProfile();
    }
}

/// create Bnak Account

public class BankAccount {
    public String accountNumber;
    public String accountHolderName;
    public double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("A001", "Alice Smith", 1000.0);
        account1.checkBalance();

        account1.deposit(500.0);
        account1.checkBalance();

        account1.withdraw(300.0);
        account1.checkBalance();

        account1.withdraw(1500.0); // Invalid withdrawal due to insufficient funds
        account1.checkBalance();
    }
}

// shoppinh cart

import java.util.ArrayList;
import java.util.List;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public String cartId;
    public String customerName;
    public List<Product> items;

    public ShoppingCart(String cartId, String customerName) {
        this.cartId = cartId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println("Added item: " + product.name + " Price: " + product.price);
    }

    public void removeItem(Product product) {
        if (items.remove(product)) {
            System.out.println("Removed item: " + product.name);
        } else {
            System.out.println("Item not found: " + product.name);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.price;
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("C001", "John Doe");

        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Smartphone", 800.0);

        cart.addItem(product1);
        cart.addItem(product2);

        System.out.println("Total cost: " + cart.calculateTotal());

        cart.removeItem(product1);
        System.out.println("Total cost after removal: " + cart.calculateTotal());
    }
}

// financial transaction system

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

class FinancialTransactionSystem {
    public static void processTransaction(Transaction transaction) {
        if (transaction.isValid()) {
            System.out.println("Transaction of amount $" + transaction.getAmount() + " is valid.");
        } else {
            System.out.println("Transaction of amount $" + transaction.getAmount() + " exceeds the limit.");
        }
    }

    public static void main(String[] args) {
        Transaction deposit = new DepositTransaction(500, 1000);
        Transaction withdrawal = new WithdrawalTransaction(1200, 1000);

        processTransaction(deposit);
        processTransaction(withdrawal);
    }
}

// network monitoring system

public class main {
    public static void main(String[] args) {

        Router r1 = new Router("test");
        System.out.println(r1.getStatus());
        System.out.println(r1.isAvailable());

    }
}

interface NetworkDevice {

    public String getStatus(); // * shall return a String indicating the current status of device

    public boolean isAvailable(); // * shall return boolean indicating if the device is currently available and
                                  // * functioning correctly.

}

class Router implements NetworkDevice {
    private String status;
    private boolean isAvailable;

    Router(String status) {
        try {
            if (!status.toLowerCase().equals("active") && !status.toLowerCase().equals("inactive")) {
                throw new IllegalArgumentException("Invalid status passed");
            } else {
                this.status = status.toLowerCase();
                if (status.equals("active")) {
                    isAvailable = true;
                } else {
                    isAvailable = false;
                }
            }
        } catch (IllegalArgumentException e) {
            this.status = "Not available";
            System.out.println("Error occured due to: " + e.getMessage());
        }

    }

    public String getStatus() {
        return status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

class Switch implements NetworkDevice {
    private String status;
    private boolean isAvailable;

    Switch(String status) {
        try {
            if (!status.toLowerCase().equals("active") && !status.toLowerCase().equals("inactive")) {
                throw new IllegalArgumentException("Invalid status passed");
            } else {
                this.status = status.toLowerCase();
                if (status.equals("active")) {
                    isAvailable = true;
                } else {
                    isAvailable = false;
                }
            }
        } catch (IllegalArgumentException e) {
            this.status = "Not available";
            System.out.println("Error occured due to: " + e.getMessage());
        }

    }

    public String getStatus() {
        return status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

// length specification exceptio

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum String length: ");
        int minLength = sc.nextInt();
        System.out.println("Enter maximum String length: ");
        int maxLength = sc.nextInt();
        sc.nextLine(); // * Scanner.nextInt() only consumes integer not the whole line so to consume
                       // * whole line have to use this...

        System.out.println("Enter String: ");
        String enteredString = sc.nextLine();

        sc.close();
        try {
            if (enteredString.length() < minLength || enteredString.length() > maxLength) {
                throw new InvalidStringLengthException("Invalid String Length " + enteredString.length());
            }
            System.out.println("The entered String satisfies given conditions: " + enteredString);

        } catch (InvalidStringLengthException e) {
            System.out.println(e.getMessage());
        }

    }

}

class InvalidStringLengthException extends Error {

    InvalidStringLengthException(String s) {
        super(s);
    }
}

// exception valid email
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email address: ");
        String emailAddress = sc.nextLine().trim();
        sc.close();

        try {
            if (!emailAddress.contains("@") || !emailAddress.contains(".") || emailAddress.length() < 5) {
                throw new InvalidEmailException("Invalid email address");
            }
            System.out.println("The Email address is valid: " + emailAddress);

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidEmailException extends Error {

    InvalidEmailException(String s) {
        super(s);
    }
}

/// highest ,max and lowest
public class Qs9 {

    static int max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < 5; i++) {
            if (temp <= arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int indexOfHighest(int[] arr) {
        int temp = arr[0];
        int indexOfTemp = 0;
        for (int i = 0; i < 5; i++) {
            // * Assigning the highest value to the temp and its index.
            if (temp <= arr[i]) {
                temp = arr[i];
                indexOfTemp = i;
            }
        }

        for (int j = 0; j < 5; j++) {
            // * Skiping the loop if it is the index of temp
            if (j == indexOfTemp) {
                continue;
            }
            if (temp == arr[j]) {
                // * returning the lowest index if temp matches with another element is arr
                return 0;
            }
        }

        // * Returning the index of highest
        return indexOfTemp;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");

            myArr[i] = sc.nextInt();
        }
        System.out.println("Max value is: " + max(myArr));
        System.out.println("Index of highest: " + indexOfHighest(myArr));
        sc.close();
    }

}

/// vowel and consonent

import java.util.Scanner;

public class Qs10 {

    static boolean isVowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {
            return true;
        }
        return false;

    }

    static int countVowels(String sentence) {
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (isVowel(sentence.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    static int countConsonants(String sentence) {
        int consonantCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (!isVowel(sentence.charAt(i))) {
                consonantCount++;
            }
        }

        return consonantCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        System.out.println("Number of vowels: " + countVowels(sentence));
        System.out.println("Number of consonants: " + countConsonants(sentence));

    }

}