package inheritance_execise;

public class Main {
    public static void main(String[] args) {

        Employee sbu = new Employee("Sbu", "29/04/2000", 
                "20/01/2026", 70000);


        System.out.println(sbu);
        System.out.println("Age =" + sbu.getAge());
        System.out.println("Pay =" + sbu.collectPay());

        Employee nkosi = new Employee("nkosi", "11/11/2001",
                "03/03/2025", 70000);

        System.out.println(nkosi);
        System.out.println("nkosi's PayCheck = $" + nkosi.collectPay());

        nkosi.retire();
        System.out.println("nkosi Pension check = $" + nkosi.collectPay());


        HourlyEmployee khona = new HourlyEmployee("khona", "05/05/2005",
                "15/05/20202", 0, 15);

        System.out.println(khona);
        System.out.println("khona's PayCheck = $" + khona.collectPay());
        System.out.println("khona Holiday pay = $" + khona.getDoublePay());
    }
}
