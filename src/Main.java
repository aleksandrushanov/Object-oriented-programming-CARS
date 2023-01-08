public class Main {
    public static void main(String[] args) {
        Car cars = new Car("Lada", "Granta", 1.7, "желтого цвета", 2015, "Россия");
        Car cars1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car cars2 = new Car("BMW", "Z8",3.0,"Черный",2021,"Германия");
        Car cars3 = new Car("KIA", "Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея ");
        Car cars4 = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея");

        System.out.println(cars);
        System.out.println(cars1);
        System.out.println(cars2);
        System.out.println(cars3);
        System.out.println(cars4);

    }
}