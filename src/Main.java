public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");

        System.out.println("Car make" + car.getMake());
        System.out.println("Car model" + car.getModel());
        car.describeCar();
    }
}