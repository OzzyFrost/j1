package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class Setting extends JFrame {
    int size = 3;
    int dotsToWin = 3;

    public Setting(int x,int y) {
        setBounds(x, y, 300, 300);
        setTitle("XOGame Setting");

        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1,1));
        JButton btnNewGame = new JButton("Ok");
        btnNewGame.setBackground(Color.cyan);
        downPanel.add(btnNewGame);
        add(downPanel,BorderLayout.SOUTH);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setVisible(false);
    }
}
