class Car1 {
    String model;
    double price;

    // Constructor using 'this' keyword
    Car1(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating car objects
        Car1  c1 = new Car1("Toyota", 25000);
        Car1 c2 = new Car1("Honda", 22000);

        // Display details
        c1.display();
        c2.display();
    }
}
