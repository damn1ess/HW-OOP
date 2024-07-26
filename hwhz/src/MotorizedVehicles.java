public abstract class MotorizedVehicles extends WheeledVehicles {
    public MotorizedVehicles(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void checkEngine();
}
