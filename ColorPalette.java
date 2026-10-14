import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Frame {

    public ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 300);
        setLayout(new GridLayout(2, 3, 10, 10));

        Button red = new Button("Red");
        Button green = new Button("Green");
        Button blue = new Button("Blue");
        Button yellow = new Button("Yellow");
        Button orange = new Button("Orange");
        Button pink = new Button("Pink");

        red.setBackground(Color.RED);
        green.setBackground(Color.GREEN);
        blue.setBackground(Color.BLUE);
        yellow.setBackground(Color.YELLOW);
        orange.setBackground(Color.ORANGE);
        pink.setBackground(Color.PINK);

        add(red);
        add(green);
        add(blue);
        add(yellow);
        add(orange);
        add(pink);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
