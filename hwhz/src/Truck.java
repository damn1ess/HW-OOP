public class Truck extends MotorizedVehicles {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика " + getModelName());
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + getModelName());
    }

    @Override
    public void vehicleService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}