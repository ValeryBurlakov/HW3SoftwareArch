public class JamesBondCar extends Car{
    public JamesBondCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }
    // LSP Барбара Лисков, мы можем двигаться, а как двигаться.... Можем ехать, а можем и полететь
    // просто переопределив метод
    @Override
    public void move() {
        System.out.println("наше ТС полетело");
    }
}
