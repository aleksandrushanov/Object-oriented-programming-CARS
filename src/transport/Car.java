package transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int numberOfSeats;
    private boolean season;
    private Key key;
        public static class Key{
            final private boolean remoteLaunch;
            final private boolean keylessAccess;

            public Key(boolean remoteLaunch, boolean keylessAccess) {
                this.remoteLaunch = remoteLaunch;
                this.keylessAccess = keylessAccess;
            }

            public boolean isRemoteLaunch() {
                return remoteLaunch;
            }

            public boolean isKeylessAccess() {
                return keylessAccess;
            }

            @Override
            public String toString() {
                return (remoteLaunch ? "Удаленый запуск двигателя" : "Без удаленого запуска двигателя ") +", " +
                        (keylessAccess ? " Безключевой доступ " : "Отсутсвует безключевой доступ");
            }
        }

    public Car(String brand,String model,double engineVolume,String color,int year,String country,int maxSpeed,
               String transmission,String bodyType, String registrationNumber,int numberOfSeats,boolean season, Key key) {
            super(brand,model,year,country,color,maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Седан";
        }this.bodyType=bodyType;
        setRegistrationNumber(registrationNumber);
        if (numberOfSeats <= 0) {
            numberOfSeats = 4;
        }
        this.numberOfSeats = numberOfSeats;
        this.season = season;
        setKey(key);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission="МКПП";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "а123аа154";
        }
        this.registrationNumber=registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSeason() {
        return season;
    }

    public void setSeason(boolean season) {
        this.season = season;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key=new Key(false,false);
        }
        this.key = key;
    }

    public void changingTires(int moth) {
        if (moth <= 4 && moth >= 10) {
            season = false;// зима
        } else if (moth > 4 && moth < 10) {
            season = true; //лето
        }else if (moth<=13){
            System.out.println("Укажите коректный месяц");
        }
    }

    @Override
    public String toString() {
        return
                super.toString() + ", " +
                        ", Объём " + engineVolume +
                        ", Коробка передач'" + transmission + '\'' +
                        ", Тип кузова '" + bodyType + '\'' +
                        ", Регистрационный номер '" + registrationNumber + '\'' +
                        ", Количетсво сидений " + numberOfSeats + " , " +
                        (season ? "летняя" : "зимняя") + " резина" + " , " + key;
    }
}
