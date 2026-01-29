import entity.Player;
import graphics.GameFrame;

public class Main {

    public static void main(String[] args) {
        
        Player player = new Player(0,0,10);
        
        int frameTime = 50;
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            new GameFrame();
        });
        
        
        while(true)
        {
            // displays pos
            System.out.print("\033[H\033[2J");
            System.out.println("pos: X|" + player.x + " Y|" + player.y);
            
            try {
            Thread.sleep(frameTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}