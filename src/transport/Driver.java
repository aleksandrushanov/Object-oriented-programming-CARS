package transport;

public abstract class Driver {

    private String fio;
    private boolean drivingLicense;
    private int experience;

    public Driver(String fio, boolean drivingLicense, int experience) {
        this.fio = fio;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelTheCar();

    @Override
    public String toString() {
        return
                "водитель " + fio + '\'' +
                ",  имеет права  " + (drivingLicense ? "да": "нет") +
                ", опыт " + experience + " лет";
    }
}
