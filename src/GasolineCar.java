public class GasolineCar extends Car implements GasStation{
    public GasolineCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, engineVolume);
    }
    // DIP мы можем заправить наш авто хоть картошкой, хоть ураном,
    // у нас есть заправка, а уж чем заправлять можно и тут решить
    // устранили зависимость верхнего класса от класса нижнего уровня за счет интерфейса
    @Override
    public void refuel() {
        System.out.println("Наше ТС заправлено бензином");
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
