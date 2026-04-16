public class OrderProcedural {
     
    public static void main(String[] args) {
        double[] prices = {500.0,1500.00,250.0,1200.0};
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        System.out.println("Total Order Price (Procedural): " + total);
    }


}
