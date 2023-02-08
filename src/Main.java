import transport.*;


public class Main {
    public static void main(String[] args) {


        Bus man = new Bus("man", "Lion’s Coach",4.2, new DriverD("Александ Викторович ",true, 5),null);
        System.out.println(man);
        Bus volvo = new Bus("Volvo", "B12", 3.6,new DriverD("Виктор Викторович ",true, 6),TypeCapacity.ESPECIALLY_BIG);
        System.out.println(volvo);
        Bus nefaz = new Bus("НефАЗ", "5299",5.0,new DriverD("Андрей Викторович ",true, 4),TypeCapacity.ESPECIALLY_SMALL);
        System.out.println(nefaz);
        Bus ikarus = new Bus("Ikarus", "256", 3.2,new DriverD("Виталий Викторович ",true, 9),TypeCapacity.AVERAGE);
        System.out.println(ikarus);
        nefaz.start();
        ikarus.bestCircle();
        volvo.maxSpeed();

        Car audi = new Car("audi", "TT", 5.0,new DriverB("Андрей Андреевич",true,5),TypeBodyCar.SEDAN);
        System.out.println(audi);
        Car bmw = new Car("Bmw", "X5", 4.4,new DriverB("Виктор Андреевич",true,4),TypeBodyCar.CROSSOVER);
        System.out.println(bmw);
        Car nissan = new Car("Nissan", "Skyline", 2.5,new DriverB("Ярослав Андреевич",true,6),TypeBodyCar.COPE);
        System.out.println(nissan);
        Car toyota = new Car("Toyota", "Supra", 3.0,new DriverB("Артём Андреевич",true,8),TypeBodyCar.COPE);
        System.out.println(toyota);
        toyota.stop();
        Trucks freightliner = new Trucks("Freightliner", "Cascadia", 15.6,new DriverC("Анатолий Анатольевич",true,5),null);
        System.out.println(freightliner);
        Trucks peterbilt = new Trucks("Peterbilt", "587", 10.9,new DriverC("Аркадий Анатольевич",true,4),LoadCapacity.N1);
        System.out.println(peterbilt);
        Trucks westernStar = new Trucks("Western Star", "4900 EX", 8.0,new DriverC("Вениамин Анатольевич",true,9),LoadCapacity.N2);
        System.out.println(westernStar);
        Trucks mack = new Trucks("Mack", "Programm", 16.0,new DriverC("Дмитрий Анатольевич",true,12),LoadCapacity.N3);
        System.out.println(mack);
        mack.bestCircle();

        printInfo(audi);
        printInfo(nefaz);
        printInfo(westernStar);
        man.printType();
        peterbilt.printType();
        audi.printType();
    }
    private static void printInfo(Transport transport) {
        System.out.println("водитель "+ transport.getDriver().getFio() + " управляет автомобилем "+ transport.getBrand() + " и будет участвовать в заезде");
    }
}