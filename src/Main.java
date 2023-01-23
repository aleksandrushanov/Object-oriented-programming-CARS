import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 0, "желтого цвета", 2015, "Россия",100,"Механика","Седан","к976мм134",5,true,new Car.Key(true,false));
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия",210,"автомат","седан","т356ок54",5,true,null);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8",3.0,"Черный",2021,"Германия",240,"автомат","родстер","в256кк01",2,false,new Car.Key(false,true));
        System.out.println(bmw);
        Car kia = new Car("KIA", "Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея ",190,"автомат","кроссовер","н856см154",5,true,new Car.Key(false,true));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея",150,"автомат","Седан","к504мм134",5,false,new Car.Key(true,true));
        System.out.println(hyundai);
        hyundai.changingTires(7);
        System.out.println(hyundai);

        System.out.println(" ");

        Bus man = new Bus("man", "Lion’s Coach", 2005, "Germany", "white", 110);
        System.out.println(man);
        Bus volvo = new Bus("Volvo", "B12", 2000, "Sweden", "black", 120);
        System.out.println(volvo);
        Bus nefaz = new Bus("НефАЗ", "5299", 1995, "Russia", "Red", 80);
        System.out.println(nefaz);
    }
}