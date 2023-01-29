package transport;

public class Car extends Transport<DriverB>  {

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " закончил движение");
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
}
