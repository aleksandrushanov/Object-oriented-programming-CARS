package transport;

public class Transport {
    final private String brand;

    final private String model;

    final private int year;

    final private String country;

    private String color;

    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        }else{
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 180;
        }
        this.maxSpeed=maxSpeed;
    }

    @Override
    public String toString() {
        return "Бернед " + brand + '\'' +
                ", Модель'" + model + '\'' + ",  Цвет '" + color + '\'' +
                ", Год: " + year +
                ", Страна'" + country + '\'' +
                ", Максимальная скорость " + maxSpeed;
    }
}
