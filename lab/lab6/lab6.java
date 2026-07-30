
import java.util.Scanner;

public class lab6 {

    // Задание 1. Площадь прямоугольника
    public static double rectangleArea(double width, double height) {

        return width * height;
    }

    // Задание 2. Проверка чётности числа
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    // Задание 3. Перегрузка метода max
    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Задание 4. Рекурсивный факториал
    public static long factorial(int n) {

        if (n < 0) {
            return -1;
        }

        // базовый случай
        if (n == 0 || n == 1) {
            return 1;
        }

        // рекурсивный вызов
        return n * factorial(n - 1);
    }

    // Задание 5. Рекурсивная степень
    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("----- Задание 1 -----");

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);

        System.out.println("Площадь прямоугольника: " + area);

        // Задание 2
        System.out.println("\n----- Задание 2 -----");

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число является чётным");
        } else {
            System.out.println("Число является нечётным");
        }

        // Задание 3
        System.out.println("\n----- Задание 3 -----");

        System.out.println("Максимум int: " + max(10, 25));

        System.out.println("Максимум double: " + max(5.5, 8.2));

        // Задание 4
        System.out.println("\n----- Задание 4 -----");

        System.out.print("Введите число для факториала: ");
        int factNumber = scanner.nextInt();

        long resultFactorial = factorial(factNumber);

        if (resultFactorial == -1) {
            System.out.println("Факториал отрицательного числа не существует");
        } else {
            System.out.println("Факториал: " + resultFactorial);
        }

        // Задание 5
        System.out.println("\n----- Задание 5 -----");

        System.out.print("Введите основание степени: ");
        int base = scanner.nextInt();

        System.out.print("Введите показатель степени: ");
        int exponent = scanner.nextInt();

        System.out.println("Результат: " + power(base, exponent));

        scanner.close();
    }
}
