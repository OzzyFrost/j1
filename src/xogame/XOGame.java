package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class XOGame extends JFrame {

    JButton[][] btns;
    Result result;

    public XOGame() {
        setBounds(300, 200, 600, 630);
        setTitle("XOGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JFrame settingWindow = new Setting();
        result = new Result(500,300);

        Font font = new Font("Arial", Font.BOLD, 24);
        btns = new JButton[Logic.SIZE][Logic.SIZE];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(Logic.SIZE, Logic.SIZE));
        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                btns[i][j] = new JButton();
                btns[i][j].setFont(font);
                final int y = i;
                final int x = j;
                btns[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Logic.isCellValid(x, y)) {
                            System.out.println(x + " " + y);//
                            Logic.map[y][x] = Logic.DOT_X;
                            Logic.humanWent = true;
                        }
                    }
                });
                panel.add(btns[i][j]);
            }
        }
        add(panel,BorderLayout.CENTER);

        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1,2));
        JButton btnNewGame = new JButton("New game");
        btnNewGame.setBackground(Color.cyan);
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(Color.pink);
        downPanel.add(btnNewGame);
        downPanel.add(btnExit);
        add(downPanel,BorderLayout.SOUTH);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        start();
    }

    public void start() {
        Logic.initMap();
        Logic.printMap();
        System.out.println("start...");
        while (true) {
            do {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!Logic.humanWent);
            Logic.humanWent = false;
            System.out.println("human turned");
            Logic.printMap();
            printMap();
            if (Logic.checkWin(Logic.DOT_X)) {
                System.out.println("Игрок победил!!!");
                result.setText("Игрок победил!!!");
                result.setVisible(true);
                return;
            }
            if (Logic.isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                return;
            }

            Logic.aiTurn();
            System.out.println("ai turned");
            Logic.printMap();
            printMap();
            if (Logic.checkWin(Logic.DOT_O)) {
                System.out.println("Компьютер победил!!!");
                result.setText("Компьютер победил!");
                result.setVisible(true);
                return;
            }
            if (Logic.isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                return;
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                btns[i][j].setText(""+Logic.map[i][j]);
            }
        }
    }
}
