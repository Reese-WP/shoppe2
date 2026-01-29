package graphics;

import javax.swing.*;  
import java.awt.event.*;
import java.awt.*; 

public class GamePanel extends JPanel {
    private int width = 500, height = 300;
    private static java.awt.Color backround = new java.awt.Color(50, 50, 50);
    private static java.awt.Color textColor = new java.awt.Color(200, 200, 200);
    
    // Movement booleans (assumed from your snippet)
    private boolean up, down, left, right;

    public GamePanel() {
        setPreferredSize(new Dimension(width, height));
        setBackground(backround);

        // 1. Set layout to BorderLayout so children can fill the space
        setLayout(new BorderLayout());

        // 2. Create the label with HTML for automatic text wrapping
        JLabel screenLabel = new JLabel("<html><div style='text-align: center;'>"
                + ""
                + "</div></html>");
        
        // Style the label
        screenLabel.setForeground(textColor);
        screenLabel.setFont(new Font("Serif", Font.BOLD, 10));
        
        // Center the text horizontally and vertically within the label
        screenLabel.setHorizontalAlignment(SwingConstants.CENTER);
        screenLabel.setVerticalAlignment(SwingConstants.CENTER);

        // 3. Add to the center of the panel
        add(screenLabel, BorderLayout.CENTER);

        setFocusable(true);
        requestFocusInWindow();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W) up = true;
                if (e.getKeyCode() == KeyEvent.VK_S) down = true;
                if (e.getKeyCode() == KeyEvent.VK_A) left = true;
                if (e.getKeyCode() == KeyEvent.VK_D) right = true;
            }
        });
    }
}