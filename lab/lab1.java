
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class lab1 {

    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("Фамилия, имя, отчество: Ващенко Лев Антонович");
        System.out.println("Учебная группа: ИС-25-21");
        System.out.println("Образовательная программа: Информационные технологии");
    }
}
