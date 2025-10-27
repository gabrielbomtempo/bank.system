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
}
