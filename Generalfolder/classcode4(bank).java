import java.util.Scanner;

abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed! Not enough balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    final double overdraftLimit = 10000;

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", 5000);
        BankAccount acc2 = new CurrentAccount("CA202", 2000);

        acc1.deposit(2000);
        acc1.withdraw(6000);

        acc2.deposit(3000);
        acc2.withdraw(12000);
        System.out.println("Divya, 24csu357");
    }
}
