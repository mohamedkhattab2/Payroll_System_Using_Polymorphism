import com.inheritance.Employee;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }


        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1) {
            throw new IllegalArgumentException("Commission rate must to be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }


    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {

        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1) {
            throw new IllegalArgumentException("Commission rate must to be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    //return String representation of CommissionEmployee object
    @Override // indicates that method overrides a superclass method
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee",super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

} // end class CommissionEmployee

