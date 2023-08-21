public class Trike extends Car{
    public Trike(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, 3, fuelType, engineVolume);
    }
    // LSP Барабара Лисков, ну тут нам нужно быть уверенными что у всех наследников будет одинаковое количество колес,
    // иначе Барбара не соблюдается
}
