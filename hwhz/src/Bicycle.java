public class Bicycle extends WheeledVehicles {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда " + getModelName());
    }

    @Override
    public void vehicleService() {
        updateTyre();
    }
}
