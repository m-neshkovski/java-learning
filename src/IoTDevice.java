public class IoTDevice {
    private boolean hasWorkToDo;

    public IoTDevice() {
        this.hasWorkToDo = false;
    }

    protected void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected boolean getHasWorkToDo() {
        return this.hasWorkToDo;
    }
}
