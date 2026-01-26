public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishwasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishwasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public void addWatter() {
        this.brewMaster.brewCoffee();
    }

    public void pourMilk() {
        this.iceBox.orderFood();
    }

    public void loadDishwasher() {
        this.dishwasher.doDishes();
    }

    public void setKitchenState(boolean isBrewMasterWorking, boolean isDishwasherWorking, boolean isIceBoxWorking) {
        if(isBrewMasterWorking) {
            this.addWatter();
        }

        if(isIceBoxWorking) {
            this.pourMilk();
        }

        if(isDishwasherWorking) {
            this.loadDishwasher();
        }
    }

    public void doKitchenWork() {
        addWatter();
        pourMilk();
        loadDishwasher();
    }
}
