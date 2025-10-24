package bank;

public class Main {
    public static void main(String[] args) {
        //Test Account Class//
        Account acc = new Account("Alice", "1234", 100.0);
        System.out.println(acc.checkPassword("1234"));
        acc.deposit(50.0);
        System.out.println(acc.getBalance());
        acc.deposit(0.1);
        System.out.println(acc.getBalance());
        acc.withdraw(150.0);
        System.out.printf("%.2f\n", acc.getBalance());
        System.out.println(acc.checkPassword("0000"));
        System.out.println(acc.checkPassword("0000"));
        System.out.println(acc.checkPassword("0000"));
        System.out.println(acc.checkPassword("0000"));

        //Test Bank Class//

        Bank bank = new Bank();
        bank.createAccount("Alice", "1234", 100.0);
        bank.createAccount("Bob", "3333", 200.0);
        bank.createAccount("Alice", "0000", 300.0);

        Account found = bank.findAccount("Bob");
        if (found != null) {
            System.out.println(found.getUsername() + " balance and password: " + found.getBalance() + " " +found.getPassword());
            found.deposit(50.0);
            System.out.println(found.getUsername() + " balance and password: " + found.getBalance() +" " + found.getPassword());


        }
    }
}