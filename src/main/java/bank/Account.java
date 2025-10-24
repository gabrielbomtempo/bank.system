package bank;

public class Account {
    private String username;
    private String password;
    private double balance;
    private int failedAttempts;
    private boolean isBlocked;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.failedAttempts = 0;
        this.isBlocked = false;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return this.password;
    }
    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount!");
            return false;
        }
    }
    public void blockAccount() {
        this.isBlocked = true;
    }
    public boolean isBlocked() {
        return this.isBlocked;}

    public boolean withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
    }
    public boolean checkPassword(String inputPassword) {
        if (isBlocked) {
            System.out.println("Account is blocked!");
            return false;
        }
        if (this.password.equals(inputPassword)) {
            failedAttempts = 0;
            System.out.println("Welcome " + username + ".");
            return true;
        } else {
            failedAttempts++;
            System.out.println("Invalid password!");
        }
        if (failedAttempts >= 3) {
            blockAccount();
            System.out.println("Account is blocked after 3 attempts");
        }
        return false;
    }
}