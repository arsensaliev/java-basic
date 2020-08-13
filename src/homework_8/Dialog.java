package homework_8;

import javax.swing.*;

public class Dialog extends JFrame {
    private JPanel content;

    public Dialog(String message) {
        setBounds(550, 550, 100, 100);
        content = new JPanel();
        content.add(new JLabel(message));
        add(content);
        setVisible(false);
    }
}
