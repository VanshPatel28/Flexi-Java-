import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    private String name;
    private List<Double> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if no grades are available
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("-----------------------------");
    }
}

// GradeManager class
class GradeManager {
    private List<Student> students;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to find a student by name
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null; // Return null if student not found
    }

    // Method to display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Student student : students) {
                student.displayStudentDetails();
            }
        }
    }
}

// Main class to test the Grade Management System
public class Main {
    public static void main(String[] args) {
        // Create a GradeManager instance
        GradeManager gradeManager = new GradeManager();

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add grades for students
        student1.addGrade(85.5);
        student1.addGrade(90.0);
        student1.addGrade(78.5);

        student2.addGrade(92.0);
        student2.addGrade(88.5);
        student2.addGrade(95.0);

        // Add students to the GradeManager
        gradeManager.addStudent(student1);
        gradeManager.addStudent(student2);

        // Display all students
        System.out.println("All students and their grades:");
        gradeManager.displayAllStudents();

        // Find a student by name and display their details
        String searchName = "Alice";
        Student foundStudent = gradeManager.findStudentByName(searchName);
        if (foundStudent != null) {
            System.out.println("\nDetails of student '" + searchName + "':");
            foundStudent.displayStudentDetails();
        } else {
            System.out.println("\nStudent with name '" + searchName + "' not found.");
        }
    }
}
