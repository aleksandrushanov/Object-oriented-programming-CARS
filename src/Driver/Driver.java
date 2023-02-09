package Driver;

import transport.Transport;

public abstract class Driver<D extends Transport> {

    private String fio;
    private boolean drivingLicense;
    private int experience;
    private String rightsCategory;

    public Driver(String fio, boolean drivingLicense, int experience, String rightsCategory) throws RightsVerificationException {
        this.fio = fio;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        setRightsCategory(rightsCategory);
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

    public String getRightsCategory() {

        return this.rightsCategory;
    }

    public void setRightsCategory(String rightsCategory) throws RightsVerificationException {
        if (rightsCategory == null || rightsCategory.isEmpty() || rightsCategory.isBlank()) {
            throw new RightsVerificationException("Необходимо указать тип прав!" + " " +getFio());
        } else if (rightsCategory.equals("B") || rightsCategory.equals("C") || rightsCategory.equals("D")) {
            this.rightsCategory = rightsCategory;
        } else {
            throw new RightsVerificationException("Необходимо указать тип прав!" + " " +getFio());
        }
    }

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelTheCar();



    @Override
    public String toString() {
        return
                "водитель " + getFio() + '\'' +
                ",  имеет права  " + (drivingLicense ? "да": "нет") +
                ", опыт " + getExperience() + " лет" + ", категория " + getRightsCategory();
    }


}
