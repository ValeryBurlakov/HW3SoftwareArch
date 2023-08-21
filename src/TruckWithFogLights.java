public class TruckWithFogLights extends Car{
    public TruckWithFogLights(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }
    @Override
    public void turnOnFogLights() {
        System.out.println("Наше ТС включило противотуманки");
    }
    public void transportCargo() {
        System.out.println("Наше ТС перевозит груз");
    }
}
