package inheritance_execise;

public class Main {
    public static void main(String[] args) {

        Employee sbu = new Employee("Sbu", "29/04/2000", 
                29292, "20/01/2026");

        System.out.println(sbu);
        System.out.println("Age =" + sbu.getAge());
        System.out.println("Pay =" + sbu.collectPay());

    }
}
