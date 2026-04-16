import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }
}

public class StudentMarksTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.next();

            System.out.print("Enter number of subjects for " + name + ": ");
            int n = sc.nextInt();

            int[] marks = new int[n];
            System.out.print("Enter marks: ");
            for (int j = 0; j < n; j++) {
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(name, marks);
        }

        Student topStudent = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }

        System.out.println("Topper: " + topStudent.name);
        System.out.println("Average Marks: " + topStudent.getAverage());
    }
}
