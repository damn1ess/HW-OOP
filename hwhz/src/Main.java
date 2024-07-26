        public class Main {
    public static void printSeparator(){
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        Car car = new Car("Car1", 4);
        Car car2 = new Car("Car2",6);


        Truck truck = new Truck("truck1",8);
        Truck truck2 = new Truck("truck2", 12);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",3);



        bicycle2.vehicleService();
        printSeparator();
        bicycle.vehicleService();
        printSeparator();
        truck2.vehicleService();
        printSeparator();
        truck.vehicleService();
        printSeparator();
        car2.vehicleService();
        printSeparator();
        car.vehicleService();
        printSeparator();

    }
}