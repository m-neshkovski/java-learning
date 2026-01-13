public class Main {

    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Milosh", "22.08.1983", "01.09.2021", 50000.0);

        HourlyEmployee employee2 = new HourlyEmployee("Julija", "01.04.1985", "01.09.2021", 50.0);

        printEmployeeData(employee1);

        employee1.retire();

        printEmployeeData(employee1);


        printEmployeeData(employee2);

        employee2.getDoublePay();

        printEmployeeData(employee2);

        employee2.terminate("01.01.2026");

        printEmployeeData(employee2);
    }

    private static void printEmployeeData(Employee employee) {
        System.out.println("Employee " + employee.getName() + " is " + employee.getAge() + " years old.");
        System.out.println("Collects " + employee.collectPay() + " euros pay per month.");
        System.out.println(employee);
        System.out.println("----------------------------");
        System.out.println();
    }
}