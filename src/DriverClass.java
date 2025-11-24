public class DriverClass {
    int FuelCapacity;
    int wheels;
    int color;
    int seats;

    public void addFuel(int fuel){
        FuelCapacity += fuel;
    }
    public void showFuelBar(){
        System.out.println("Fuel Bar: " + FuelCapacity);
    }
    public void drive(){
        System.out.println("Driving....");
        FuelCapacity -= 1;
    }

}
