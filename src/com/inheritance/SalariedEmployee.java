package com.inheritance;

// salaried employee concrete class extends class Employee
public class SalariedEmployee extends Employee {

    // instance variables
    private double weeklySalary;

    // constructor
    public SalariedEmployee
    (String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException
                    ("weekly salary must be >=0");
        }
        this.weeklySalary = weeklySalary;
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException
                    ("weekly salary must be >=0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f", "salaried employee", super.toString(), "weekly salary",
                getWeeklySalary());
    }

    @Override
    public double getPayment() {
        return getWeeklySalary();
    }
} // end class Salaried employee
