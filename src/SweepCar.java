public class SweepCar extends Car{
    public SweepCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }

    @Override
    public void sweepStreet() {
        System.out.println("Наше ТС подметает улицу");
    }
}
