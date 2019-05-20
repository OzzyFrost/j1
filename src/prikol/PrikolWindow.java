package prikol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PrikolWindow extends JFrame {
    JLabel label;
    JButton buttonOk;
    JButton buttonNo;
    Random random;

    public PrikolWindow() {
        setBounds(200, 200, 600, 600);
        setTitle("Опрос работников от директора");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        random = new Random();
        Font font = new Font("Arial", 0, 24);

        label = new JLabel("<html>Хотите увеличу <b>Вам</b> <i>зарплату</i> в 2 раза?</html>");
        label.setBounds(100, 20, 400, 200);
        label.setFont(font);
        add(label);

        buttonOk = new JButton("Конечно! Да!");
        buttonNo = new JButton("Нет");
        buttonOk.setBounds(100,300,150,50);
        buttonNo.setBounds(300,300,150,50);
        buttonOk.setFocusable(false);
        add(buttonOk);
        add(buttonNo);

        buttonOk.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                buttonOk.setLocation(random.nextInt(450), random.nextInt(450));
            }
        });


        setVisible(true);
    }
}
