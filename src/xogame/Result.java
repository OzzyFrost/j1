package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame {
    JButton btn;
    public Result(int x,int y){
        setBounds(x, y, 400, 200);
        setTitle("XOGame result");
        btn = new JButton("Player win!");
        add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setVisible(false);
    }

    public void setText(String text){
        btn.setText(text);
    }

}
