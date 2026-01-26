public class DishWasher extends IoTDevice {
    public DishWasher() {
        super();
    }

    public void doDishes() {
        if(super.getHasWorkToDo()) {
            System.out.println("Dishwasher is already working on something else.");
        } else {
            System.out.println("Dishwasher is working on your dishes.");
            super.setHasWorkToDo(true);
        }
    }
}
