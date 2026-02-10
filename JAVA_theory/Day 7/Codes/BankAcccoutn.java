import java.util.ArrayList;
import java.util.List;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Account class
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        }
    }

    // Method to transfer money to another account
    public void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (this == targetAccount) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " from account " + accountNumber + " to account " + targetAccount.accountNumber);
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------------");
    }
}

// Bank class
class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to create a new account
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        System.out.println("Account created for " + accountHolderName + " with account number " + accountNumber);
    }

    // Method to find an account by account number
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        return null; // Return null if account not found
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("All accounts in the bank:");
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}

// Main class to test the Bank Account Management System
public class Main {
    public static void main(String[] args) {
        // Create a Bank instance
        Bank bank = new Bank();

        // Create accounts
        bank.createAccount("A123", "Alice", 1000.0);
        bank.createAccount("B456", "Bob", 500.0);

        // Display all accounts
        System.out.println("\nInitial Account Details:");
        bank.displayAllAccounts();

        // Deposit money into Alice's account
        Account aliceAccount = bank.getAccount("A123");
        if (aliceAccount != null) {
            aliceAccount.deposit(200.0);
        }

        // Withdraw money from Bob's account
        Account bobAccount = bank.getAccount("B456");
        if (bobAccount != null) {
            try {
                bobAccount.withdraw(100.0);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }

        // Transfer money from Alice's account to Bob's account
        if (aliceAccount != null && bobAccount != null) {
            try {
                aliceAccount.transfer(bobAccount, 300.0);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }

        // Display all accounts after transactions
        System.out.println("\nUpdated Account Details:");
        bank.displayAllAccounts();
    }
}
