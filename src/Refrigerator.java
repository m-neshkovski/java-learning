public class Refrigerator extends IoTDevice {
    public Refrigerator() {
        super();
    }

    public void orderFood() {
        if(this.getHasWorkToDo()) {
            System.out.println("Refrigerator is already working on something else.");
        } else {
            System.out.println("Refrigerator is working on your order.");
            super.setHasWorkToDo(true);
        }
    }
}
