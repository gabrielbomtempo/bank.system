package bank;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Account findAccount(String username) {
        for (Account x : accounts) {
            if (x.getUsername().equalsIgnoreCase(username)) {
                return x;
            }
        }
        return null;
    }

    public void createAccount(String username, String password, double balance) {
        if (findAccount(username) != null) {
            return;
        }
        Account newAccount = new Account(username, password, balance);
        accounts.add(newAccount);
    }
    public boolean login(String username, String password) {
        Account account = findAccount(username);
        if (account == null) {
            System.out.println("Welcome" + username);
            return false;
        }
        if (account.isBlocked()) {
            System.out.println("Account is blocked");
            return false;
        }
        boolean success = account.checkPassword(password);
        return success;
    }
}
