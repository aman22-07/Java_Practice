// 1. The Account Class
class Account {
    // 2. Data Fields
    private String accountNumber;
    private double balance;

    // 3. Data Setup Method (Initializes the object's data)
    public void setupAccount(String number, double initialDeposit) {
        this.accountNumber = number;
        this.balance = initialDeposit;
        System.out.println("-> Account " + number + " created with $" + initialDeposit);
    }

    // 4. Core Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else if (amount > 0) {
            System.out.println("Withdrawal failed for " + accountNumber + ": Insufficient funds.");
            return false;
        }
        return false;
    }

    // Getter for the Account Number (used by BankManager to find the object)
    public String getAccountNumber() {
        return accountNumber;
    }

    // 5. Info Getter
    public String getSummary() {
        // String.format is a handy way to format output precisely
        return "Account: " + accountNumber + " | Balance: $" + String.format("%.2f", balance);
    }
}

// 2. The BankManager Class
public class BankManager {
    // 2. Data Field: Array to hold multiple Account objects
    private Account[] accounts;
    private int accountCount = 0;

    // 3. Initialization
    public void initializeBank(int maxAccounts) {
        this.accounts = new Account[maxAccounts];
        System.out.println("\nBank Manager initialized, capacity for " + maxAccounts + " accounts.");
    }

    // 4. Account Creation
    public void createAccount(String accNum, double initial) {
        if (accountCount < accounts.length) {
            // CRITICAL STEP: Create the actual Account object
            Account newAccount = new Account();
            newAccount.setupAccount(accNum, initial);
            
            // Store the created object reference in the array
            accounts[accountCount] = newAccount;
            accountCount++;
        } else {
            System.out.println("Bank is full! Cannot create account " + accNum);
        }
    }

    // 5. Action Method: Processes deposit/withdraw
    public void processTransaction(String accNumToFind, double amount, String type) {
        System.out.println("\n--- Processing " + type + " on " + accNumToFind + " ---");
        
        // Looping through the array of Account objects
        for (int i = 0; i < accountCount; i++) {
            // Get the current Account object from the array
            Account currentAccount = accounts[i];
            
            // Check if this object's account number matches the one we are looking for
            if (currentAccount.getAccountNumber().equals(accNumToFind)) {
                
                // FOUND the specific object! Now call its method.
                if (type.equalsIgnoreCase("deposit")) {
                    currentAccount.deposit(amount);
                } else if (type.equalsIgnoreCase("withdraw")) {
                    currentAccount.withdraw(amount);
                }
                return; // Stop searching once the account is found
            }
        }
        System.out.println("Error: Account " + accNumToFind + " not found.");
    }

    // 6. Display Method
    public void listAllAccounts() {
        System.out.println("\n--- Full Account List (" + accountCount + " total) ---");
        for (int i = 0; i < accountCount; i++) {
            // Call the getSummary method on EACH Account object
            System.out.println(accounts[i].getSummary());
        }
        System.out.println("-------------------------------------");
    }

    // Main method to run the program and test the interaction
    public static void main(String[] args) {
        // Create the BankManager object
        BankManager manager = new BankManager();
        
        // Initialize the Bank to hold 3 accounts
        manager.initializeBank(3); 
        
        // Create 2 Account objects through the manager
        manager.createAccount("A001", 500.00);
        manager.createAccount("B002", 100.00);
        
        // Process transactions by calling the manager, which then calls the Account object's methods
        manager.processTransaction("A001", 250.00, "deposit");
        manager.processTransaction("B002", 30.00, "withdraw");
        manager.processTransaction("A001", 1000.00, "withdraw"); // Should succeed
        manager.processTransaction("B002", 500.00, "withdraw");  // Should fail (Insufficient funds)
        
        // List all accounts to see the final balances
        manager.listAllAccounts();
    }
}
