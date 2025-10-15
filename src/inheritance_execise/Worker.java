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
        return 0;
    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        return null;
    }
}
