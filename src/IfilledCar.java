public class IfilledCar extends Car implements GasStation{
    public IfilledCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }
    // по заданию из презентации тут нужно имплементить только 1 метод, поэтому ругается
    @Override
    public void refuel() {
        System.out.println("Я заправил ТС, я молодец");
    }
}
