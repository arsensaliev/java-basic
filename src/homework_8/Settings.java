package homework_8;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {
    private Game game;

    private static final int WINDOW_POS_X = Game.WINDOW_POS_X + 50;
    private static final int WINDOW_POS_Y = Game.WINDOW_POS_Y + 50;
    private static final int WINDOW_SIZE_X = Game.WINDOW_SIZE_X - 100;
    private static final int WINDOW_SIZE_Y = Game.WINDOW_SIZE_Y - 100;
    private static final int MIN_BATTLE_SIZE = 3;
    private static final int MAX_BATTLE_SIZE = 5;
    private JRadioButton radioHumanVsAi;
    private JRadioButton radioHumanVsHuman;
    private ButtonGroup groupGameMode;

    private JSlider battleSize;

    static final int GAME_MODE_VS_AI = 0;
    static final int GAME_MODE_VS_HUMAN = 1;

    public Settings(Game game) {
        this.game = game;
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_SIZE_X, WINDOW_SIZE_Y);
        setTitle("Settings");

        setLayout(new GridLayout(8, 1));

        add(new JLabel("Choose game mode:"));

        radioHumanVsAi = new JRadioButton("Human Vs AI", true);
//        radioHumanVsHuman = new JRadioButton("Human vs Human");

        add(radioHumanVsAi);
//        add(radioHumanVsHuman);

        groupGameMode = new ButtonGroup();
        groupGameMode.add(radioHumanVsAi);
        groupGameMode.add(radioHumanVsHuman);

        add(new JLabel("Choose battle size:"));

        battleSize = new JSlider(MIN_BATTLE_SIZE, MAX_BATTLE_SIZE, MIN_BATTLE_SIZE);
        battleSize.setMajorTickSpacing(1);
        battleSize.setPaintTicks(true);
        battleSize.setPaintLabels(true);

        add(battleSize);


        JButton startGame = new JButton("Start New Game");
        add(startGame);
        startGame.addActionListener(e -> {
            int mode = radioHumanVsAi.isSelected() ? GAME_MODE_VS_AI : GAME_MODE_VS_HUMAN;

            int size = battleSize.getValue();


            game.startNewGame(mode, size);
            Logic.SIZE = size;
            Logic.initMap();
            Logic.isFinished = false;

            setVisible(false);
        });
        setVisible(false);
    }


}
