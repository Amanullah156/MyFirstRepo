import java.util.ArrayList;
import java.util.Scanner;

class BankManagementSystem {
    private String userId;
    private String userName;
    private double balance;
    private final ArrayList<String> transactionHistory = new ArrayList<>();

    
    public BankManagementSystem() {
        this.balance = 0;
    }

    
    public boolean login(String userId, String userName) {
        if (!userId.isEmpty() && !userName.isEmpty()) {
            this.userId = userId;
            this.userName = userName;
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid login credentials. Please try again.");
        return false;
    }

    
    public void logout() {
        System.out.println("You have successfully logged out.");
        this.userId = null;
        this.userName = null;
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposit: $" + amount + " | Balance: $" + balance);
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdraw: $" + amount + " | Balance: $" + balance);
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    
    public void transfer(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Transfer: $" + amount + " | Balance: $" + balance);
            System.out.println("Transferred $" + amount + " successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            System.out.println("Invalid transfer amount.");
        }
    }

  
    public void displayAccountSummary() {
        System.out.println("Account Holder: " + userName);
        System.out.println("User ID: " + userId);
        System.out.println("Balance: $" + balance);
    }

   
    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManagementSystem bankSystem = new BankManagementSystem();
        boolean isLoggedIn = false;

        while (true) {
            if (!isLoggedIn) {
                System.out.println("\n==== Banking System ====");
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter User Name: ");
                String userName = scanner.nextLine();
                isLoggedIn = bankSystem.login(userId, userName);
            } else {
                System.out.println("\n==== Account Dashboard ====");
                System.out.println("1. Account Summary");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Transaction History");
                System.out.println("6. Logout");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        bankSystem.displayAccountSummary();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        bankSystem.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        bankSystem.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        bankSystem.transfer(transferAmount);
                        break;
                    case 5:
                        bankSystem.displayTransactionHistory();
                        break;
                    case 6:
                        bankSystem.logout();
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}