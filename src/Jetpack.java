import javax.swing.*;
import java.awt.*;

public class Jetpack extends JFrame {
    JetpackPanel game = new JetpackPanel();

    public Jetpack() {
        super("Jetpack Joyride");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(game);
        pack();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    // INTERFACE
    class JetpackPanel extends JPanel {

        public static final int WIDTH = 1000, HEIGHT = 750;// width and height of the panel
        private static int backgroundX, backgroundY, reverseBackgroundX, reverseBackgroundY;
        public static int speedX;
        private String screen;                // current screen (start, game, game over)
        private Image startScreen;

        public JetpackPanel() {
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            screen = "start";   // sets the screen to the starting screen
            initialize();
        }

        public void initialize() {
            speedX = -20;
            backgroundX = 0;
            backgroundY = 0;
            reverseBackgroundX = WIDTH;
            reverseBackgroundY = 0;
            startScreen = new ImageIcon("Images/start_screen.png").getImage();
        }

        public void paint(Graphics g) {
            g.drawImage(startScreen, 0, 0, null);
        }
    }
}


