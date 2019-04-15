package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Setting extends JFrame {
    public Setting() {
        setBounds(300, 200, 400, 400);
        setTitle("XOGame Setting");

        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1,2));
        JButton btnNewGame = new JButton("New game");
        btnNewGame.setBackground(Color.cyan);
        JButton btnExit = new JButton("Cancel");
        btnExit.setBackground(Color.pink);
        downPanel.add(btnNewGame);
        downPanel.add(btnExit);
        add(downPanel,BorderLayout.SOUTH);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.SIZE = 3;
                Logic.initMap();
            }
        });

        setVisible(false);
    }
}
