package transport;

import Driver.DriverB;

public class Car extends Transport<DriverB>  {
    private final TypeBodyCar typeBodyCar;
    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,TypeBodyCar typeBodyCar) {
        super(brand, model, engineVolume, driver);
        this.typeBodyCar = typeBodyCar;
    }

    public TypeBodyCar getTypeBodyCar() {
        return typeBodyCar;
    }

    @Override
    public void printType() {
        if (typeBodyCar == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeBodyCar);
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

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль " + getBrand()+" " + getModel()+" проходит диагнностику ");
    }

    public void pitStop() {
        System.out.println("Пит-стоп легковой машины " + getBrand());
    }

    @Override
    public void bestCircle() {
        int minTime = 3;
        int maxTime = 7;
        int time = (int) ((Math.random()*((maxTime-minTime)+1))+minTime);
        System.out.println("Лучшее время : "  + time + " минут ");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 120;
        int maxSpeed = 200;
        int speed= (int) ((Math.random()*((maxSpeed-minSpeed)+1))+minSpeed);
        System.out.println("Максимальная скорость автобуса " + speed + " км/ч");

    }
    @Override
    public String toString() {
        return "Бернед " + getBrand() + '\'' +
                ", Модель'" + getModel() + '\'' + ", Объём двигателя = " + getEngineVolume() + " Управляет автомобилем " + getDriver() + getTypeBodyCar();
    }
}
