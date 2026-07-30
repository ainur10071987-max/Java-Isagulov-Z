
import java.awt.*;
import javax.swing.*;

public class lab10 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Задание 1. Рисование фигур
        // Прямоугольник
        g.setColor(Color.BLUE);

        g.drawRect(50, 50, 150, 80);

        g.drawString("Прямоугольник", 60, 150);

        // Круг
        g.setColor(Color.RED);

        g.drawOval(250, 50, 100, 100);

        g.drawString("Круг", 280, 170);

        // Линия
        g.setColor(Color.BLACK);

        g.drawLine(450, 80, 600, 80);

        g.drawString("Линия", 510, 110);

        // Задание 2. Несколько цветов
        // Квадрат
        g.setColor(Color.GREEN);

        g.fillRect(100, 220, 80, 80);

        // Круг
        g.setColor(Color.ORANGE);

        g.fillOval(250, 220, 80, 80);

        // Треугольник
        g.setColor(Color.MAGENTA);

        int[] x = {430, 380, 480};

        int[] y = {300, 220, 220};

        g.fillPolygon(x, y, 3);

        g.setColor(Color.CYAN);

        g.fillRect(550, 220, 100, 80);

        // Задание 3. Динамическая надпись
        g.setColor(Color.DARK_GRAY);

        g.setFont(new Font("Arial", Font.BOLD, 25));

        g.drawString("Hello Java Applet", 200, 400);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Graphics");

        lab10 panel = new lab10();

        frame.add(panel);

        frame.setSize(750, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
