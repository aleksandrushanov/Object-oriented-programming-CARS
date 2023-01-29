package transport;

public class Trucks extends Transport<DriverC> {
    public Trucks(String brand,
                  String model,
                  double engineVolume,
                  DriverC driver) {
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
}
