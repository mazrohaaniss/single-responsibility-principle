/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rplbk;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 5000);
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        double totalSalary = salaryCalculator.calculateTotalSalary(employee);

        System.out.println("Total salary for " + employee.getName() + " is: $" + totalSalary);
    }
}

