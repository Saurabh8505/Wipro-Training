// overloading 
package assignment_2;

// Abstract class Employee
abstract class Employee {
   String name;
   String designation;

   
   Employee(String name, String designation) {
       this.name = name;
       this.designation = designation;
   }
 
   abstract double calculateSalary();
   abstract void displayDetails();
}

// FullTimeEmployee class extends Employee
class FullTimeEmployee extends Employee {
   double monthlySalary;

   FullTimeEmployee(String name, String designation, double monthlySalary) {
       super(name, designation);
       this.monthlySalary = monthlySalary;
   }

   @Override
   double calculateSalary() {
       return monthlySalary;
   }

   @Override
   void displayDetails() {
       System.out.println("Full-Time Employee: " + name);
       System.out.println("Designation: " + designation);
       System.out.println("Salary: " + calculateSalary());
   }
}

// PartTimeEmployee class extends Employee
class PartTimeEmployee extends Employee {
   double hourlyRate;
   int hoursWorked;

   
   PartTimeEmployee(String name, String designation, double hourlyRate, int hoursWorked) {
       super(name, designation);
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
   }

   @Override
   double calculateSalary() {
       return hourlyRate * hoursWorked;
   }

   @Override
   void displayDetails() {
       System.out.println("Part-Time Employee: " + name);
       System.out.println("Designation: " + designation);
       System.out.println("Salary: " + calculateSalary());
   }
}

// Main class to demonstrate polymorphism
public class EmployeeManagementSystem {
   public static void main(String[] args) {
       // Create an array of Employee objects
       Employee fullTimeEmployee1 = new FullTimeEmployee("Alice", "Software Engineer", 50000);
        Employee partTimeEmployee = new PartTimeEmployee("Bob", "Intern", 20, 80);
        Employee fullTimeEmployee2 = new FullTimeEmployee("Charlie", "Manager", 70000);

        // Display details and calculate salaries using polymorphism
        fullTimeEmployee1.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        System.out.println();
        fullTimeEmployee2.displayDetails();
   }
}
