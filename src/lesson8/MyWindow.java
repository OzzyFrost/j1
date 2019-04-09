package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;

    JTextArea textArea;

    public MyWindow(){
        setBounds(300,200,600,600);
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,4));
//        southPanel.setLayout(new BoxLayout(southPanel,BoxLayout.Y_AXIS));
        southPanel.setPreferredSize(new Dimension(10, 60));
        btn1 = new JButton("btn1");
        southPanel.add(btn1);
        btn2 = new JButton("btn2");
        southPanel.add(btn2);
        btn3 = new JButton("btn3");
        southPanel.add(btn3);
        btn4 = new JButton("btn4");
        southPanel.add(btn4);
        add(southPanel,BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        JTextField textField = new JTextField();
        panel.add(textField);
        btn5 = new JButton("send");
        panel.add(btn5);
        add(panel,BorderLayout.SOUTH);

        ActionListener al =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText()+"\n");
                textField.setText("");
            }
        };

        btn5.addActionListener(al);
        textField.addActionListener(al);


        textArea = new JTextArea();
        add(textArea,BorderLayout.CENTER);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello!\n");
            }
        });


        setVisible(true);
    }

//    public MyWindow() {
//        setBounds(300, 200, 600, 600);
//        setTitle("MyWindow");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
////        setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
//        setLayout(new GridLayout(3, 3));
////        btn1 = new JButton("btn1");
//////        add(btn1);
//////        btn2 = new JButton("btn2");
//////        add(btn2);
//////        btn3 = new JButton("btn3");
//////        add(btn3);
//////        btn4 = new JButton("btn4");
//////        add(btn4);
////        btn5 = new JButton("btn5");
////        add(btn5);
//        Font font = new Font("Times New Roman", Font.BOLD, 30);
//        for (int i = 0; i < 9; i++) {
//            JButton btn = new JButton("#" + (i + 1));
//            btn.setFont(font);
//            add(btn);
//        }
//
////        setResizable(false);
//        setVisible(true);
//    }


//    public MyWindow(){
//        setBounds(300,200,600,600);
//        setTitle("MyWindow");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        btn1 = new JButton("btn1");
//        btn1.setPreferredSize(new Dimension(10, 60));
//        add(btn1,BorderLayout.NORTH);
//        btn2 = new JButton("btn2");
//        add(btn2,BorderLayout.SOUTH);
//        textArea = new JTextArea();
//        add(textArea,BorderLayout.CENTER);
//
//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello!");
//            }
//        });
//        btn2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textArea.append("Hello!\n");
//            }
//        });
//
//
//        setVisible(true);
//    }
}
