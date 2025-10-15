package inheritance_execise;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString();
    }

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = employeeId;
    }
}
