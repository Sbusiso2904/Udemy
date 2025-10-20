package inheritance_execise;

public class HourlyEmployee  extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, int annualSalary,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate, annualSalary);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return  40 *  hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}
