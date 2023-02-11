package transport;

import Driver.DriverC;

public class Trucks extends Transport<DriverC> {
    private final  LoadCapacity loadCapacity;

    public Trucks(String brand,
                  String model,
                  double engineVolume,
                  DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " закончил движение");
    }

    public void passDiagnostics() {
        System.out.println("грузовик " +getBrand() + " "+ getModel() + " проходит диагнностику ");
    }

    public void pitStop() {
        System.out.println("Пит-стоп грузовой машины " + getBrand());
    }

    @Override
    public void bestCircle() {
        int minTime = 10;
        int maxTime = 15;
        int time = (int) ((Math.random()*((maxTime-minTime)+1))+minTime);
        System.out.println("Лучшее время : "  + time + " минут ");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 100;
        int maxSpeed = 150;
        int speed= (int) ((Math.random()*((maxSpeed-minSpeed)+1))+minSpeed);
        System.out.println("Максимальная скорость автобуса " + speed + " км/ч");

    }
    public String toString() {
        return "Бернед " + getBrand() + '\'' +
                ", Модель'" + getModel() + '\'' + ", Объём двигателя = " + getEngineVolume() + " Управляет автомобилем " + getDriver() + " " + getLoadCapacity();
    }
}
