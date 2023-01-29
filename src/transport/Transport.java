package transport;
public abstract class Transport<D extends Driver> implements Competing {
    final private String brand;

    final private String model;

    private double engineVolume;

    private D driver;



    public Transport(String brand, String model, double engineVolume,D driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 2.0;
        }
        this.engineVolume = engineVolume;
    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public abstract void start();

    public abstract void stop();


    @Override
    public String toString() {
        return "Бернед " + brand + '\'' +
                ", Модель'" + model + '\'' + ", Объём двигателя = " + engineVolume + " Управляет автомобилем " + driver;
    }


}
