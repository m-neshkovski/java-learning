public class HourlyEmployee extends Employee {

    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        hourlyPayRate *= 2;
    }

    @Override
    public double collectPay() {
        return getEndDate().isEmpty() ? hourlyPayRate * 175 : 0.0;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
