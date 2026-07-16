
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Сумма и среднее арифметическое двух чисел
        System.out.println("----- Задание 1 -----");

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double average = sum / 2;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        // 2. Площадь и периметр прямоугольника
        System.out.println("\n----- Задание 2 -----");

        System.out.print("Введите длину прямоугольника: ");
        double a = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double b = scanner.nextDouble();

        double area = a * b;
        double perimeter = 2 * (a + b);

        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);

        // 3. Площадь круга
        System.out.println("\n----- Задание 3 -----");

        final double PI = 3.14;

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double circleArea = PI * Math.pow(radius, 2);

        System.out.println("Площадь круга: " + circleArea);

        // 4. Перевод температуры из Цельсия в Фаренгейт
        System.out.println("\n----- Задание 4 -----");

        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        // 5. Расстояние при равномерном движении
        System.out.println("\n----- Задание 5 -----");

        System.out.print("Введите скорость движения: ");
        double speed = scanner.nextDouble();

        System.out.print("Введите время движения: ");
        double time = scanner.nextDouble();

        double distance = speed * time;

        System.out.println("Расстояние: " + distance);

        // 6. Квадрат и куб числа
        System.out.println("\n----- Задание 6 -----");

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);

        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);

        scanner.close();
    }
}
