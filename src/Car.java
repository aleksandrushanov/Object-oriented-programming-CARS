
public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand,String model,double engineVolume,String color,int year,String country) {
        this.brand = brand;
        this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        }else{
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
    }


    @Override
    public String toString() {
        if (brand == null || brand.isEmpty()) {
            return "default";
        } else if (model == null || model.isEmpty()) {
            return "default";
        } else if (country == null || country.isEmpty()) {
            return "default";
        } else {
            return "Car{" +
                    "Бренд '" + brand + '\'' +
                    ", модель '" + model + '\'' +
                    ", объем двигателя = " + engineVolume +
                    ", цвет '" + color + '\'' +
                    ", год выпуска = " + year +
                    ", страна выпуска '" + country + '\'' +
                    '}';
        }
    }

}
