package xogame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));
        JLabel sizeLabel = new JLabel("size = 3");
        panel.add(sizeLabel);
        JSlider slSize = new JSlider(3,Logic.maxSize,3);
        panel.add(slSize);
        JLabel dotsToWinLabel = new JLabel("dotsToWin = 3");
        panel.add(dotsToWinLabel);
        JSlider slDotsToWin = new JSlider(3,3,3);
        panel.add(slDotsToWin);

        ChangeListener changeListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slDotsToWin.setMaximum(slSize.getValue());
                sizeLabel.setText("size = "+ slSize.getValue());
                dotsToWinLabel.setText("dotsToWin = "+ slDotsToWin.getValue());
            }
        };

        slSize.addChangeListener(changeListener);
        slSize.setPaintTicks(true);
        slSize.setMajorTickSpacing(1);
        slDotsToWin.addChangeListener(changeListener);
        slDotsToWin.setPaintTicks(true);
        slDotsToWin.setMajorTickSpacing(1);

        JButton btnNewGame = new JButton("Ok");
        btnNewGame.setBackground(Color.cyan);
        panel.add(btnNewGame);
        add(panel,BorderLayout.CENTER);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = slSize.getValue();
                dotsToWin = slDotsToWin.getValue();
                setVisible(false);
            }
        });

        setVisible(false);
    }
}
