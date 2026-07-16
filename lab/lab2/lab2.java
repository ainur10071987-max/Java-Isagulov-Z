// Задача 1-5. Переменные, типы данных, область видимости,
// наследование, переопределение методов и полиморфизм

class Person {

    // Поля класса
    String name;
    int age;

    // Метод вывода информации
    void displayInfo() {

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {

    String group;

    @Override
    void displayInfo() {

        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

public class lab2 {

    static int classVariable = 100;

    public static void main(String[] args) {

// Задача 1. Переменные и константы
        int number = 10;
        double price = 99.99;
        boolean isStudent = true;

        // Константа
        final String UNIVERSITY = "Колледж информационных технологий";

        System.out.println("----- Задача 1 -----");
        System.out.println("Число: " + number);
        System.out.println("Цена: " + price);
        System.out.println("Студент: " + isStudent);
        System.out.println("Учебное заведение: " + UNIVERSITY);

// Задача 2. Примитивные и ссылочные типы
        int age = 20;
        String language = "Java";

        System.out.println("\n----- Задача 2 -----");
        System.out.println("Возраст (int): " + age);
        System.out.println("Язык программирования (String): " + language);

// Задача 3. Область видимости переменных
        System.out.println("\n----- Задача 3 -----");

        int localVariable = 50; // локальная переменная метода

        System.out.println("Переменная класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);

// Задача 4. Реализация наследования
        System.out.println("\n----- Задача 4 -----");

        Student student = new Student();

        student.name = "Жас Исагулов";
        student.age = 20;
        student.group = "ПО-22-1";

        student.displayInfo();

// Задача 5. Полиморфизм
        System.out.println("\n----- Задача 5 -----");

        Person person = new Student();

        person.name = "Жарас";
        person.age = 20;
        ((Student) person).group = "ПО-22-1";

        person.displayInfo();

    }
}
