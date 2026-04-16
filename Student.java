class Student {
    String name;
    int rollNumber;

    // Parameterized constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating student objects with different details
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        // Displaying student details
        s1.display();
        s2.display();
    }
}
