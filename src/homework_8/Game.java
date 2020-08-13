package homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JFrame {
    static final int WINDOW_POS_X = 400;
    static final int WINDOW_POS_Y = 400;
    static final int WINDOW_SIZE_X = 500;
    static final int WINDOW_SIZE_Y = 550;


    private Settings settings;
    private Battle battle;

    public Game() {
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_SIZE_X, WINDOW_SIZE_Y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("X-O");
        settings = new Settings(this);
        battle = new Battle(this);

        add(battle, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        JButton buttonStartGame = new JButton("New game");
        JButton buttonExitGame = new JButton("Exit");
        bottomPanel.add(buttonStartGame);
        bottomPanel.add(buttonExitGame);
        add(bottomPanel, BorderLayout.SOUTH);

        buttonExitGame.addActionListener(e -> {
            System.exit(0);
        });

        buttonStartGame.addActionListener(e -> {
            settings.setVisible(true);
        });

        setVisible(true);
    }

    public void startNewGame(int mode, int battleSize) {
      battle.startNewGame(mode, battleSize);
    }
}
