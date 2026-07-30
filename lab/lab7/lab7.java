
import java.util.Random;
import java.util.Scanner;

public class lab7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ==================================
        // 1. Сумма отрицательных элементов A[20]
        System.out.println("----- Задание 1 -----");

        int[] A = new int[20];

        int negativeSum = 0;

        for (int i = 0; i < A.length; i++) {

            A[i] = random.nextInt(41) - 20;

            if (A[i] < 0) {
                negativeSum += A[i];
            }
        }

        System.out.println("Сумма отрицательных элементов: " + negativeSum);

        // 2. Сумма положительных элементов B[15]
        System.out.println("\n----- Задание 2 -----");

        int[] B = new int[15];

        int positiveSum = 0;

        for (int i = 0; i < B.length; i++) {

            B[i] = random.nextInt(41) - 20;

            if (B[i] > 0) {
                positiveSum += B[i];
            }
        }

        System.out.println("Сумма положительных элементов: " + positiveSum);

        // 3. Произведение отрицательных элементов A[12]
        System.out.println("\n----- Задание 3 -----");

        double[] arrayA = new double[12];

        double negativeProduct = 1;

        for (int i = 0; i < arrayA.length; i++) {

            arrayA[i] = random.nextDouble() * 20 - 10;

            if (arrayA[i] < 0) {
                negativeProduct *= arrayA[i];
            }
        }

        System.out.println("Произведение отрицательных элементов: "
                + negativeProduct);

        // 4. Произведение положительных элементов C[25]
        System.out.println("\n----- Задание 4 -----");

        int[] C = new int[25];

        int positiveProduct = 1;

        for (int i = 0; i < C.length; i++) {

            C[i] = random.nextInt(41) - 20;

            if (C[i] > 0) {
                positiveProduct *= C[i];
            }
        }

        System.out.println("Произведение положительных элементов: "
                + positiveProduct);

        // 5. Среднее арифметическое массива D[17]
        System.out.println("\n----- Задание 5 -----");

        int[] D = new int[17];

        int sum = 0;

        for (int i = 0; i < D.length; i++) {

            D[i] = random.nextInt(50);

            sum += D[i];
        }

        double average = (double) sum / D.length;

        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
}
