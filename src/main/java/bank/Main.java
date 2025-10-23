package bank;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
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

    }
}
