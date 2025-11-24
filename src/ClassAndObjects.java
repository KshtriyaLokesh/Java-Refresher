public class ClassAndObjects {
    public static void main(String[] args) {
        DriverClass shiftCar = new DriverClass();
        System.out.println(shiftCar.FuelCapacity);
        shiftCar.FuelCapacity = 5;
        System.out.println(shiftCar.FuelCapacity);
        shiftCar.addFuel(6);
        shiftCar.showFuelBar();
        shiftCar.drive();
        shiftCar.drive();
        shiftCar.showFuelBar();
    }
}
