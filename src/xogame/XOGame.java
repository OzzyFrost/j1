package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Thread.sleep;

public class XOGame extends JFrame {

    Result result;
    BattleMap battleMap;
    Setting settingWindow;

    public XOGame() {
        setBounds(300, 200, 600, 630);
        setTitle("XOGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        settingWindow = new Setting(500,300);
        result = new Result(500, 300);

        battleMap = new BattleMap();
        add(battleMap, BorderLayout.CENTER);

        JLabel infoLabel = new JLabel("Играем");
        infoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(infoLabel, BorderLayout.NORTH);

        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("New game");
        btnNewGame.setBackground(Color.cyan);
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(Color.pink);
        downPanel.add(btnNewGame);
        downPanel.add(btnExit);
        add(downPanel, BorderLayout.SOUTH);

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
        start(10, 4);
        start(5, 3);

        while (true) {
            for (int i = 5; i > 0 ; i--) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                infoLabel.setText("Новая игра начнется через " + i + " секунд");
            }
            infoLabel.setText("Для победы собери в линию "+settingWindow.dotsToWin +" крестиков");
            start(settingWindow.size, settingWindow.dotsToWin);
        }
    }

    public void start(int size, int dotsToWin) {
        Logic.SIZE = size;
        Logic.DOTS_TO_WIN = dotsToWin;
        Logic.initMap();
        battleMap.repaintMap(size);
        Logic.printMap();
        printMap(Logic.SIZE);
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
            Logic.printMap();
            printMap(Logic.SIZE);
            if (Logic.checkWin(Logic.DOT_X)) {
                System.out.println("Игрок победил!!!");
                showResult("Вы победили!!!");
                return;
            }
            if (Logic.isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                showResult("Ничья, не осталось места ходить!");
                return;
            }

            Logic.aiTurn();
            Logic.printMap();
            printMap(Logic.SIZE);
            if (Logic.checkWin(Logic.DOT_O)) {
                System.out.println("Компьютер победил!!!");
                showResult("Компьютер победил!");
                return;
            }
            if (Logic.isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                showResult("Ничья, не осталось места ходить!");
                return;
            }
        }
    }

    public void printMap(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                battleMap.btns[i][j].setText("" + Logic.map[i][j]);
            }
        }
    }

    void showResult(String text) {
        result.setText(text);
        result.setVisible(true);
    }
}
