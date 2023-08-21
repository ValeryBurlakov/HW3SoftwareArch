public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private double engineVolume;
    // SRP конкретная ответственность. Класс отвечает только за характеристики и поведение автомобиля
    // и не выполняет левых методов с авто не связанных
    // OCP Открытость-закрытость - ну методы мы не меняли,
    // чтобы не менялось поведение у наследников, а накидывали новые методы

    // конструктор
    public Car(String brand,
               String model,
               String color,
               String bodyType,
               int numberOfWheels,
               String fuelType,
               double engineVolume) {
        this.bodyType = bodyType;
        this.engineVolume = engineVolume;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
    }

    public void move() {
        System.out.println("наше ТС двигается");
    }

    public void service(){
        System.out.println("наше ТС обслуживается");
    }
    public void changeGear(){
        System.out.println("у нашего ТС переключилась передача");
    }

    public void turnOnHeadlights(){
        System.out.println("у нашего ТС включились фары");
    }
    public void turnOfHeadlights(){
        System.out.println("у нашего ТС выключились фары");
    }

    public void turnOnWipers(){
        System.out.println("у нашего ТС включились дворники");
    }
    public void turnOfWipers(){
        System.out.println("у нашего ТС выключились дворники");
    }
    public void sweepStreet(){
    }

    public void turnOnFogLights(){};
    public void transportCargo(){};

}
