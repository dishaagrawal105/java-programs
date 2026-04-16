class Intern {
    String name;
    int duration;

    // Default constructor
    Intern() {
        name = "Unknown";
        duration = 0;
    }

    // Parameterized constructor
    Intern(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    // Method to display intern details
    void display() {
        System.out.println("Intern Name: " + name);
        System.out.println("Duration: " + duration + " months");
        System.out.println();
    }

    public static void main(String[] args) {
        // Object using default constructor
        Intern intern1 = new Intern();

        // Object using parameterized constructor
        Intern intern2 = new Intern("Alice", 6);
        Intern intern3 = new Intern("Bob", 3);

        // Display details
        intern1.display();
        intern2.display();
        intern3.display();
    }
}
