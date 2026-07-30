
import java.util.Scanner;

public class lab5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задание 1. Вывод чисел от 1 до N
        System.out.println("----- Задание 1 -----");

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Числа от 1 до " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Задание 2. Сумма чисел
        System.out.println("\n----- Задание 2 -----");

        System.out.print("Введите число N: ");
        int number = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= number) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел: " + sum);

        // Задание 3. Факториал
        System.out.println("\n----- Задание 3 -----");

        System.out.print("Введите число: ");
        int factorialNumber = scanner.nextInt();

        long factorial = 1;

        for (i = 1; i <= factorialNumber; i++) {
            factorial *= i;
        }

        System.out.println("Факториал = " + factorial);

        // Задание 4. Чётные числа
        System.out.println("\n----- Задание 4 -----");

        i = 1;

        while (i <= 100) {

            if (i % 2 != 0) {
                i++;
                continue;
            }

            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Задание 5. Ввод чисел до нуля
        System.out.println("\n----- Задание 5 -----");

        int value;
        int total = 0;

        do {

            System.out.print("Введите число (0 - завершить): ");
            value = scanner.nextInt();

            total += value;

        } while (value != 0);

        System.out.println("Сумма введённых чисел: " + total);

        // Таблица умножения
        System.out.println("\n----- Таблица умножения -----");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= 5; column++) {

                System.out.print((row * column) + "\t");

            }

            System.out.println();
        }

        scanner.close();
    }
}
