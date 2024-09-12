/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rplbk;

/**
 *
 * @author acer
 */
public class SalaryCalculator {
    private static final double BONUS_PERCENTAGE = 0.1; // 10% bonus

    public double calculateTotalSalary(Employee employee) {
        return employee.getBaseSalary() + calculateBonus(employee);
    }

    private double calculateBonus(Employee employee) {
        return employee.getBaseSalary() * BONUS_PERCENTAGE;
    }
}

