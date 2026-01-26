public class CoffeeMaker extends IoTDevice {
    public CoffeeMaker() {
        super();
    }

    public void brewCoffee() {
        if(super.getHasWorkToDo()) {
            System.out.println("CoffeeMaker is already working on something else.");
        } else {
            System.out.println("CoffeeMaker is brewing coffee.");
            super.setHasWorkToDo(true);
        }
    }
}
