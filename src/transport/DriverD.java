package transport;

public class DriverD extends Driver{

    public DriverD(String fio,
                   boolean drivingLicense,
                   int experience) {
        super(fio, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель" + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель" + getFio() + " закончил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель" + getFio() + " заправил авто");
    }
}
