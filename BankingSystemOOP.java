 class Account {
    
    double balance;

    Account(double balance) {
        this.balance = balance;
    }
}

public class BankingSystemOOP {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(1000.50),
            new Account(2500.75),
            new Account(3000.00),
            new Account(1500.25)
        };

        double total = 0;
        for (Account acc : accounts) {
            total += acc.balance;
        }

        System.out.println("Total Balance (OOP): " + total);
    }
}


