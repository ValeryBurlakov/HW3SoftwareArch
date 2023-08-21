public class CarAtTheGasStation extends Car implements GasStation{
    public CarAtTheGasStation(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }

    @Override
    public void refuel() {
        System.out.println("Наше ТС заправлено");
    }

    @Override
    public void wipeWindscreen() {
        System.out.println("У ТС протерли лобовое");
    }

    @Override
    public void Headlights() {
        System.out.println("У ТС протерли фары");
    }

    @Override
    public void wipeMirors() {
        System.out.println("У ТС протерли зеркала");
    }
}
