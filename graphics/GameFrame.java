package graphics;

import javax.swing.*;
//magic dont touch
public class GameFrame extends JFrame {
    public GameFrame() {
        super("Events Demo");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        add(panel);

        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }
}