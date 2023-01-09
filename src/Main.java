public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 0, "желтого цвета", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8",3.0,"Черный",2021,"Германия");
        Car kia = new Car("KIA", "Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея ");
        Car hyundai = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}