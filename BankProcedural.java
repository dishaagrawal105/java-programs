public class BankProcedural {
    public static void main(String[] args) {
        double[] balances = {1000.00, 2500.00, 3200.00, 800.00};
        double total = 0;

        for (double balance : balances) {
            total += balance;
        }

        System.out.println("Total Balance (Procedural): " + total);
    }
}
