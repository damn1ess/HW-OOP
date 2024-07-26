public abstract class WheeledVehicles implements Vehicles {
    private final String modelName;
    private final int wheelsCount;

    public WheeledVehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public abstract void updateTyre();
}
