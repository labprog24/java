import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int registerNumber;

    Student(String name, int registerNumber) {
        this.name = name;
        this.registerNumber = registerNumber;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
    }
}

class MarksStudent extends Student {
    int[] marks;

    MarksStudent(String name, int registerNumber, int[] marks) {
        super(name, registerNumber);
        this.marks = marks;
    }

    void displayTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        System.out.println("Total Marks: " + totalMarks);
    }

    void displayStudentDetails() {
        displayStudentInfo();
        System.out.println("Marks in Each Subject:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        displayTotalMarks();
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MarksStudent> students = new ArrayList<>();
        int numStudents;
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Register Number: ");
            int registerNumber = scanner.nextInt();
            int[] marks = new int[5]; // Assuming 5 subjects
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            MarksStudent student = new MarksStudent(name, registerNumber, marks);
            students.add(student);
        }
        System.out.println("Student Details:");
        for (MarksStudent student : students) {
            student.displayStudentDetails();
            System.out.println("===============");
        }
        scanner.close();
    }
}
