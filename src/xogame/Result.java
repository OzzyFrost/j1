package xogame;

import javax.swing.*;
import java.awt.*;

public class Result extends JFrame {
    JButton btn;
    public Result(int x,int y){
        setBounds(x, y, 400, 200);
        setTitle("XOGame result");
        btn = new JButton("Player win!");
        add(btn);

        setVisible(false);
    }

    public void setText(String text){
        btn.setText(text);
    }

}
