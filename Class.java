package Problems;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}

public class Class {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", 70000, "IT"),
            new Employee(102, "Bob", 85000, "HR"),
            new Employee(103, "Charlie", 65000, "Finance"),
            new Employee(104, "David", 90000, "IT"),
            new Employee(105, "Eve", 85000, "Finance")
        );

        // Find the employee with the highest salary
        Employee highestPaidEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary))
            .orElse(null);
        
        System.out.println("Highest Paid Employee: " + highestPaidEmployee);

        // Sort employees by name and then by salary
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary))
            .collect(Collectors.toList());

        System.out.println("\nEmployees sorted by Name and Salary:");
        sortedEmployees.forEach(System.out::println);
    }
}