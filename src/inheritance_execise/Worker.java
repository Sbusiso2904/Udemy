package inheritance_execise;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2025;
        int BirthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear-BirthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
