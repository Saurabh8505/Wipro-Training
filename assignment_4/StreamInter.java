//Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to:
 
// Filter employees who are older than 30.
// Find the average salary of employees who meet the age condition.
// Collect the names of these employees into a List.
// Print the list of employee names and the average salary.
// Hint: Use filter(), map(), collect(), and average() methods from Streams
 
// These are the 2 assignment questions which u need to work on 
 

package assignment_4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

   
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class StreamInter {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 35, 70000),
            new Employee("Bob", 28, 50000),
            new Employee("Charlie", 45, 80000),
            new Employee("David", 32, 60000),
            new Employee("Eva", 29, 55000)
        );

        // Stream processing
        List<String> namesOfEmployeesAbove30 = employees.stream()
            .filter(e -> e.getAge() > 30) 
            .map(Employee::getName) 
            .collect(Collectors.toList()); 

        // Calculate the average salary of employees older than 30
        OptionalDouble averageSalary = employees.stream()
            .filter(e -> e.getAge() > 30) 
            .mapToDouble(Employee::getSalary) 
            .average(); 

       
        System.out.println("Employees older than 30: " + namesOfEmployeesAbove30);
        if (averageSalary.isPresent()) {
            System.out.println("Average Salary of employees older than 30: " + averageSalary.getAsDouble());
        } else {
            System.out.println("No employees found with age above 30.");
        }
    }
}
