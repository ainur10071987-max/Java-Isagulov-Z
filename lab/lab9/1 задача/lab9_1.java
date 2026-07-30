
class Car {

    String brand;
    int speed;
    double fuel;

    void displaySpeed() {

        System.out.println("Скорость автомобиля: " + speed + " км/ч");
    }

    void fuelConsumption() {

        System.out.println("Расход топлива: " + fuel + " л/100 км");
    }
}

class Sedan extends Car {

    void displayType() {

        System.out.println("Тип автомобиля: Седан");
    }
}

class Truck extends Car {

    void displayType() {

        System.out.println("Тип автомобиля: Грузовик");
    }
}

class SUV extends Car {

    void displayType() {

        System.out.println("Тип автомобиля: Внедорожник");
    }
}

public class lab9_1 {

    public static void main(String[] args) {

        Sedan sedan = new Sedan();

        sedan.brand = "Toyota Camry";
        sedan.speed = 220;
        sedan.fuel = 7.5;

        System.out.println("----- Sedan -----");

        System.out.println("Марка: " + sedan.brand);

        sedan.displayType();
        sedan.displaySpeed();
        sedan.fuelConsumption();

        Truck truck = new Truck();

        truck.brand = "MAN";
        truck.speed = 120;
        truck.fuel = 25;

        System.out.println("\n----- Truck -----");

        System.out.println("Марка: " + truck.brand);

        truck.displayType();
        truck.displaySpeed();
        truck.fuelConsumption();

        SUV suv = new SUV();

        suv.brand = "Toyota Land Cruiser";
        suv.speed = 180;
        suv.fuel = 15;

        System.out.println("\n----- SUV -----");

        System.out.println("Марка: " + suv.brand);

        suv.displayType();
        suv.displaySpeed();
        suv.fuelConsumption();

    }
}
