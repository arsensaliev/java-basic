package homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Battle extends JPanel {
    private Game game;

    private int mode;
    private int battleSize;

    private boolean isInit = false;

    private int cellWith;
    private int cellHeight;

    public Battle(Game game) {
        this.game = game;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                clickBattleField(e);
            }
        });
    }

    private void clickBattleField(MouseEvent e) {
        int cellX = e.getX() / cellWith;
        int cellY = e.getY() / cellHeight;

        if (!Logic.isFinished) {
            Logic.humanTurn(cellX, cellY);
        }
        repaint();
    }

    public void startNewGame(int mode, int battleSize) {
        this.mode = mode;
        this.battleSize = battleSize;
        isInit = true;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(Color.BLACK);
        cellHeight = panelHeight / battleSize;
        cellWith = panelWidth / battleSize;

        for (int i = 0; i < battleSize; i++) {
            int y = i * cellHeight;
            int x = i * cellWith;
            g.drawLine(0, y, panelWidth, y);
            g.drawLine(x, 0, x, panelHeight);
        }

        for (int i = 0; i < battleSize; i++) {
            for (int j = 0; j < battleSize; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                }

                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                }
            }
        }


    }

    private void drawX(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawLine(cellWith * x, cellHeight * y, cellWith * (x + 1), cellHeight * (y + 1));
        g.drawLine(cellWith * x, cellHeight * (y + 1), cellWith * (x + 1), cellHeight * y);
    }

    private void drawO(Graphics g, int x, int y) {
        ((Graphics2D) g).setStroke(new BasicStroke(2));
        g.setColor(Color.BLUE);
        g.drawOval(cellWith * x, cellHeight * y, cellWith, cellHeight);
    }
}
