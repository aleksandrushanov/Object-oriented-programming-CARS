package transport;


import Driver.DriverD;

public class Bus extends Transport<DriverD> {
    private final TypeCapacity capacity;
    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver, TypeCapacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacity);
        }
    }

    public TypeCapacity getCapacity() {
        return capacity;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " закончил  движение");
    }


    public void passDiagnostics() {
        throw new UnsupportedOperationException("Автобус " + getBrand() + " " + getModel() + " не может пройти диагностику");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса " + getBrand());
    }

    @Override
    public void bestCircle() {
        int minTime = 10;
        int maxTime = 30;
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
                ", Модель'" + getModel() + '\'' + ", Объём двигателя = " + getEngineVolume() + " Управляет автомобилем " + getDriver() + " "+ getCapacity();
    }
}
