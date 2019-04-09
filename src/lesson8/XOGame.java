package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class XOGame extends JFrame {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '*';

    JButton[] btns;
    final int[] coord = new int[2];

    public XOGame(){
        setBounds(300,200,600,600);
        setTitle("XOGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,24);
        btns = new JButton[SIZE*SIZE];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(SIZE,SIZE));
        for (int i = 0; i < SIZE*SIZE ; i++) {
            btns[i] = new JButton("#"+i);
            btns[i].setFont(font);
            final int temp = i;
            btns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btns[temp].setText(""+DOT_X);
                    int x = temp % SIZE +1;
                    int y = temp / SIZE +1;
                    System.out.println(x+" "+y);
                    coord[0] = x;
                    coord[1] = y;
                }
            });

            panel.add(btns[i]);
        }

        add(panel);
        setVisible(true);
    }
}
