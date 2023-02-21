package Driver;

public class DriverD extends Driver {

    public DriverD(String fio,
                   boolean drivingLicense,
                   int experience,String rightsCategory) throws RightsVerificationException {
        super(fio, drivingLicense, experience,rightsCategory);
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
