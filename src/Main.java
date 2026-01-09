public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setColor("Red");
//
//        System.out.println("Car make" + car.getMake());
//        System.out.println("Car model" + car.getModel());
//        car.describeCar();

        BankAccount account = new BankAccount(12345, 10000.0, "John Doe", "john.doe@example.com", "+38972345678");

//        account.deposit(10000);

        account.withdraw(100);
        account.withdraw(900);
        account.withdraw(10000);
        account.withdraw(8999);
    }
}