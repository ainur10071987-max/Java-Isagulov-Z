
class Animal {

    String name;

    // Общий метод звука
    void makeSound() {

        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {

        System.out.println(name + " говорит: Гав-гав");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {

        System.out.println(name + " говорит: Мяу");
    }
}

class Bird extends Animal {

    @Override
    void makeSound() {

        System.out.println(name + " говорит: Чирик-чирик");
    }
}

public class lab9_2 {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Бобик";

        System.out.println("----- Собака -----");

        dog.makeSound();

        Cat cat = new Cat();

        cat.name = "Мурка";

        System.out.println("\n----- Кошка -----");

        cat.makeSound();

        Bird bird = new Bird();

        bird.name = "Попугай";

        System.out.println("\n----- Птица -----");

        bird.makeSound();

        System.out.println("\n----- Полиморфизм -----");

        Animal animal;

        animal = dog;
        animal.makeSound();

        animal = cat;
        animal.makeSound();

        animal = bird;
        animal.makeSound();

    }
}
