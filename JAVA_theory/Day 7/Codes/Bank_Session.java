import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double calculatedSalary;

    // Constructor
    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.calculatedSalary = 0; // Initialize calculated salary
    }

    // Method to calculate salary based on role
    public void calculateSalary() {
        switch (role) {
            case "Manager":
                calculatedSalary = baseSalary + (baseSalary * 0.20); // 20% bonus
                break;
            case "Developer":
                calculatedSalary = baseSalary + (baseSalary * 0.10); // 10% bonus
                break;
            case "Designer":
                calculatedSalary = baseSalary + (baseSalary * 0.05); // 5% bonus
                break;
            case "Intern":
                calculatedSalary = 1000; // Fixed salary for interns
                break;
            default:
                System.out.println("Invalid role for employee " + employeeId);
                calculatedSalary = 0;
        }
    }

    // Method to apply a deduction
    public void applyDeduction(double amount) {
        if (amount > 0 && amount <= calculatedSalary) {
            calculatedSalary -= amount;
            System.out.println("Deduction of $" + amount + " applied to employee " + employeeId);
        } else {
            System.out.println("Invalid deduction amount for employee " + employeeId);
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Calculated Salary: $" + calculatedSalary);
        System.out.println("-----------------------------");
    }
}

// Payroll class
class Payroll {
    private List<Employee> employees;

    // Constructor
    public Payroll() {
        employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getName() + " added to the payroll.");
    }

    // Method to calculate salaries of all employees
    public void calculateAllSalaries() {
        for (Employee employee : employees) {
            employee.calculateSalary();
        }
        System.out.println("Salaries calculated for all employees.");
    }

    // Method to find an employee by ID
    public Employee findEmployeeById(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null; // Return null if employee not found
    }

    // Method to display all employees
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the payroll.");
        } else {
            System.out.println("All employees in the payroll:");
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }
    }
}

// Main class to test the Payroll Management System
public class Bank_Session {
    public static void main(String[] args) {
        // Create a Payroll instance
        Payroll payroll = new Payroll();

        // Create employees
        Employee emp1 = new Employee("E001", "Alice", "Manager", 5000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 4000);
        Employee emp3 = new Employee("E003", "Charlie", "Designer", 3000);
        Employee emp4 = new Employee("E004", "David", "Intern", 0);

        // Add employees to the payroll
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);

        // Calculate salaries for all employees
        payroll.calculateAllSalaries();

        // Display all employees
        System.out.println("\nEmployee Details:");
        payroll.displayAllEmployees();

        // Apply a deduction to an employee
        Employee employee = payroll.findEmployeeById("E001");
        if (employee != null) {
            employee.applyDeduction(200);
        }

        // Display updated details after deduction
        System.out.println("\nUpdated Employee Details:");
        payroll.displayAllEmployees();
    }
}
