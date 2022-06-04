package com.inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate,double baseSalary) {

        // explicit call to superclass CommissionEmployee constructor
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        // implicit call to Object's default constructor


        if (baseSalary <0.0){
            throw new IllegalArgumentException("base salary must to be >= 0");
        }
        this.baseSalary =baseSalary;

    } // end constructor
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <0.0){
            throw new IllegalArgumentException("base salary must to be >= 0");
        }
        this.baseSalary = baseSalary;
    }

    // calculate earnings
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    //return String representation of CommissionEmployee object
    @Override // indicates that method overrides a superclass method
    public String toString() {
        return String.format("%s %s; %s: $%.2f",
                "base-salaried", super.toString(),
                "base salary",getBaseSalary());
    }
} // end class BasePlusCommissionEmployee
