package com.inheritance;

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for week

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) {
            throw new IllegalArgumentException
                    ("Hour wage must be >=0.0");
        }
        if (hours < 0.0 || hours < 168.0) {
            throw new IllegalArgumentException
                    ("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f; %s: %.2f ", "hourly employee",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
} // end class HourlyEmployee
