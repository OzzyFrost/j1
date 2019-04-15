package xogame;

import javax.swing.*;
import java.awt.*;

public class Result extends JFrame {
    JButton btn;
    public Result(){
        setBounds(300, 200, 400, 400);
        setTitle("XOGame result");
        btn = new JButton("Player win!");
        add(btn);

        setVisible(false);
    }

    public void setText(String text){
        btn.setText(text);
    }

}
